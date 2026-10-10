// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceGroupSourceFileResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success. A failure returns a backend error code (ERR.* / InvalidParameter.*).</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The OSS persistent storage path of the replacement file.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://example/new.txt</p>
     */
    @NameInMap("filePath")
    public String filePath;

    /**
     * <p>The OSS persistent storage path of the replacement file.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/new.txt">https://example.com/new.txt</a></p>
     */
    @NameInMap("filePublicUrl")
    public String filePublicUrl;

    /**
     * <p>The file record ID of the replacement file.</p>
     * 
     * <strong>example:</strong>
     * <p>file_example</p>
     */
    @NameInMap("fileRecordId")
    public String fileRecordId;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>The current zone list is illegal.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The image name.</p>
     * 
     * <strong>example:</strong>
     * <p>Project resources</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E68654BD-F7BA-5837-8686-5645D739A47C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>source_example</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The data source type. The value is fixed as FILE.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>The data source status. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Online.</li>
     * <li><strong>0</strong>: Offline.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("status")
    public String status;

    public static ReplaceGroupSourceFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReplaceGroupSourceFileResponseBody self = new ReplaceGroupSourceFileResponseBody();
        return TeaModel.build(map, self);
    }

    public ReplaceGroupSourceFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReplaceGroupSourceFileResponseBody setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public ReplaceGroupSourceFileResponseBody setFilePublicUrl(String filePublicUrl) {
        this.filePublicUrl = filePublicUrl;
        return this;
    }
    public String getFilePublicUrl() {
        return this.filePublicUrl;
    }

    public ReplaceGroupSourceFileResponseBody setFileRecordId(String fileRecordId) {
        this.fileRecordId = fileRecordId;
        return this;
    }
    public String getFileRecordId() {
        return this.fileRecordId;
    }

    public ReplaceGroupSourceFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReplaceGroupSourceFileResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ReplaceGroupSourceFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReplaceGroupSourceFileResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public ReplaceGroupSourceFileResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ReplaceGroupSourceFileResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
