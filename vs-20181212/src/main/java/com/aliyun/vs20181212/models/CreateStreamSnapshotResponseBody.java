// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateStreamSnapshotResponseBody extends TeaModel {
    @NameInMap("Format")
    public String format;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("OssObject")
    public String ossObject;

    @NameInMap("Height")
    public Long height;

    @NameInMap("Id")
    public String id;

    @NameInMap("Width")
    public Long width;

    @NameInMap("Timestamp")
    public Long timestamp;

    @NameInMap("Url")
    public String url;

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

    public CreateStreamSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStreamSnapshotResponseBody setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public CreateStreamSnapshotResponseBody setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public CreateStreamSnapshotResponseBody setOssObject(String ossObject) {
        this.ossObject = ossObject;
        return this;
    }
    public String getOssObject() {
        return this.ossObject;
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

    public CreateStreamSnapshotResponseBody setWidth(Long width) {
        this.width = width;
        return this;
    }
    public Long getWidth() {
        return this.width;
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

}
