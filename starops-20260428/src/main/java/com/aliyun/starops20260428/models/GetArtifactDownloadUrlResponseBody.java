// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class GetArtifactDownloadUrlResponseBody extends TeaModel {
    /**
     * <p>The expiration time of the download URL. This value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1770000000</p>
     */
    @NameInMap("expire")
    public Long expire;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A1B2C3D-4E5F-6789-ABCD-1234567890AB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The temporary download URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/agents/123/sample-agent/home/starops/reports/summary.pdf?response-content-disposition=attachment&Expires=1770000000&OSSAccessKeyId=LTAI******&Signature=">https://example-bucket.oss-cn-shanghai.aliyuncs.com/agents/123/sample-agent/home/starops/reports/summary.pdf?response-content-disposition=attachment&amp;Expires=1770000000&amp;OSSAccessKeyId=LTAI******&amp;Signature=</a>******</p>
     */
    @NameInMap("url")
    public String url;

    public static GetArtifactDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactDownloadUrlResponseBody self = new GetArtifactDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetArtifactDownloadUrlResponseBody setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public GetArtifactDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetArtifactDownloadUrlResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
