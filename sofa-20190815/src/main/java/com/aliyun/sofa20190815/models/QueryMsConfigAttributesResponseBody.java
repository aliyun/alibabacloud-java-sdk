// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsConfigAttributesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Attribute")
    public QueryMsConfigAttributesResponseBodyAttribute attribute;

    public static QueryMsConfigAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsConfigAttributesResponseBody self = new QueryMsConfigAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsConfigAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsConfigAttributesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsConfigAttributesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsConfigAttributesResponseBody setAttribute(QueryMsConfigAttributesResponseBodyAttribute attribute) {
        this.attribute = attribute;
        return this;
    }
    public QueryMsConfigAttributesResponseBodyAttribute getAttribute() {
        return this.attribute;
    }

    public static class QueryMsConfigAttributesResponseBodyAttribute extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        public static QueryMsConfigAttributesResponseBodyAttribute build(java.util.Map<String, ?> map) throws Exception {
            QueryMsConfigAttributesResponseBodyAttribute self = new QueryMsConfigAttributesResponseBodyAttribute();
            return TeaModel.build(map, self);
        }

        public QueryMsConfigAttributesResponseBodyAttribute setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public QueryMsConfigAttributesResponseBodyAttribute setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryMsConfigAttributesResponseBodyAttribute setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMsConfigAttributesResponseBodyAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
