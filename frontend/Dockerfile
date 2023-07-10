FROM node:18.16.1 as node
WORKDIR /app
COPY pet-project/package.json .
COPY pet-project/. .
RUN npm install
RUN npm run build --prod

EXPOSE 4200
