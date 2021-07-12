package iudx.aaa.server.apiserver;

public class Constants {
  // Header params
  public static final String HEADER_TOKEN = "token";
  public static final String HEADER_HOST = "Host";
  public static final String HEADER_ACCEPT = "Accept";
  public static final String HEADER_CONTENT_LENGTH = "Content-Length";
  public static final String HEADER_CONTENT_TYPE = "Content-Type";
  public static final String HEADER_ORIGIN = "Origin";
  public static final String HEADER_REFERER = "Referer";
  public static final String HEADER_ALLOW_ORIGIN = "Access-Control-Allow-Origin";
  public static final String HEADER_OPTIONS = "options";

  // API Documentation endpoint
  public static final String ROUTE_STATIC_SPEC = "/apis/spec";
  public static final String ROUTE_DOC = "/apis";

  // Accept Headers and CORS
  public static final String MIME_APPLICATION_JSON = "application/json";
  public static final String MIME_TEXT_HTML = "text/html";
  
  public static final String NIL_UUID = "00000000-0000-0000-0000-000000000000";
  
  /* API Server Routes */
  public static final String API_TOKEN="/auth/v1/token";
  public static final String API_INTROSPECT_TOKEN="/auth/v1/interospect";
  public static final String API_REVOKE_TOKEN="/auth/v1/token/revoke";

}
