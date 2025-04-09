// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateDownloadUrlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p><a href="http://www.xxx.com/xxx">http://www.xxx.com/xxx</a></p>
     */
    @NameInMap("FileHttpUrl")
    public String fileHttpUrl;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EC08CC41-6870-5594-939A-F758F057898F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDownloadUrlResponseBody self = new CreateDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDownloadUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDownloadUrlResponseBody setFileHttpUrl(String fileHttpUrl) {
        this.fileHttpUrl = fileHttpUrl;
        return this;
    }
    public String getFileHttpUrl() {
        return this.fileHttpUrl;
    }

    public CreateDownloadUrlResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateDownloadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDownloadUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
