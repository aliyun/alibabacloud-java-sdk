// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateStreamSnapshotResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>jpg</p>
     */
    @NameInMap("Format")
    public String format;

    /**
     * <strong>example:</strong>
     * <p>720</p>
     */
    @NameInMap("Height")
    public Long height;

    /**
     * <strong>example:</strong>
     * <p>323*****997-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>examplebucket</p>
     */
    @NameInMap("OssBucket")
    public String ossBucket;

    /**
     * <strong>example:</strong>
     * <p>oss-cn-qingdao.aliyuncs.com</p>
     */
    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    /**
     * <strong>example:</strong>
     * <p>photos/live/340200*****100049/ondemand-1639126601767.jpg</p>
     */
    @NameInMap("OssObject")
    public String ossObject;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1639126601767</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    /**
     * <strong>example:</strong>
     * <p><a href="http://examplebucket.oss-*****.aliyuncs.com/photos/live/340200*****100049/ondemand-1639126601767.jpg">http://examplebucket.oss-*****.aliyuncs.com/photos/live/340200*****100049/ondemand-1639126601767.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    /**
     * <strong>example:</strong>
     * <p>1280</p>
     */
    @NameInMap("Width")
    public Long width;

    public static CreateStreamSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamSnapshotResponseBody self = new CreateStreamSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStreamSnapshotResponseBody setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public CreateStreamSnapshotResponseBody setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public CreateStreamSnapshotResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateStreamSnapshotResponseBody setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public CreateStreamSnapshotResponseBody setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public CreateStreamSnapshotResponseBody setOssObject(String ossObject) {
        this.ossObject = ossObject;
        return this;
    }
    public String getOssObject() {
        return this.ossObject;
    }

    public CreateStreamSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStreamSnapshotResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public CreateStreamSnapshotResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateStreamSnapshotResponseBody setWidth(Long width) {
        this.width = width;
        return this;
    }
    public Long getWidth() {
        return this.width;
    }

}
