// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateNumberDistrictInfoDownloadUrlResponseBody extends TeaModel {
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
     * <p>1364f208-982d-4d0c-89aa-d56e22b47589</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateNumberDistrictInfoDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNumberDistrictInfoDownloadUrlResponseBody self = new CreateNumberDistrictInfoDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNumberDistrictInfoDownloadUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateNumberDistrictInfoDownloadUrlResponseBody setFileHttpUrl(String fileHttpUrl) {
        this.fileHttpUrl = fileHttpUrl;
        return this;
    }
    public String getFileHttpUrl() {
        return this.fileHttpUrl;
    }

    public CreateNumberDistrictInfoDownloadUrlResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateNumberDistrictInfoDownloadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateNumberDistrictInfoDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNumberDistrictInfoDownloadUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
