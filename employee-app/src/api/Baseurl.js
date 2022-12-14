import axios from "axios"

export const BASE_URL = "http://localhost:8085/"
export const api = axios.create({
  baseURL:BASE_URL,
  headers:{"Content-Type": "application/json",
  "Access-Control-Allow-Origin": "*",
  "Access-Control-Allow-Methods": "GET, POST, PUT, DELETE, PATCH, OPTIONS",
  "Access-Control-Allow-Headers": "*",
  "Access-Control-Allow-Credentials": true,
  "mediaType": "json"}
})


