// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateStreamSnapshotResponseBody extends TeaModel {
    @NameInMap("Format")
    public String format;

    @NameInMap("Height")
    public Long height;

    @NameInMap("Id")
    public String id;

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    @NameInMap("OssObject")
    public String ossObject;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Timestamp")
    public Long timestamp;

    @NameInMap("Url")
    public String url;

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
