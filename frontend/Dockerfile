#FROM node:alpine AS builder
#WORKDIR /app
#COPY . .
#RUN npm install && \
#    npm run build
#FROM nginx:alpine
#COPY --from=builder /app/dist/* /usr/share/nginx/html/
#COPY /nginx.conf /etc/nginx/conf.d/default.conf

#FROM node:18.16.0-alpine
#WORKDIR /app
#COPY pet-project/package.json .
#COPY pet-project/node_modules .
#RUN npm install
#COPY . .
#EXPOSE 4200

FROM node:18.16.1 as node
WORKDIR /app
COPY pet-project/package.json .
COPY pet-project/node_modules .
COPY pet-project/. .
RUN npm install
RUN npm run build --prod

#FROM nginx:alpine
#COPY --from=node /app/dist/angular-app /usr/share/nginx/html
EXPOSE 4200