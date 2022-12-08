// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class DescribeComponentResponseBody extends TeaModel {
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RenderedContent")
    public String renderedContent;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Template")
    public DescribeComponentResponseBodyTemplate template;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("Version")
    public String version;

    public static DescribeComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentResponseBody self = new DescribeComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComponentResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public DescribeComponentResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public DescribeComponentResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeComponentResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeComponentResponseBody setRenderedContent(String renderedContent) {
        this.renderedContent = renderedContent;
        return this;
    }
    public String getRenderedContent() {
        return this.renderedContent;
    }

    public DescribeComponentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeComponentResponseBody setTemplate(DescribeComponentResponseBodyTemplate template) {
        this.template = template;
        return this;
    }
    public DescribeComponentResponseBodyTemplate getTemplate() {
        return this.template;
    }

    public DescribeComponentResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DescribeComponentResponseBody setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DescribeComponentResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class DescribeComponentResponseBodyTemplate extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Uri")
        public String uri;

        public static DescribeComponentResponseBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            DescribeComponentResponseBodyTemplate self = new DescribeComponentResponseBodyTemplate();
            return TeaModel.build(map, self);
        }

        public DescribeComponentResponseBodyTemplate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeComponentResponseBodyTemplate setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

}
