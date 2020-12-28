// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceInServiceListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<OnsInstanceInServiceListResponseBodyData> data;

    public static OnsInstanceInServiceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsInstanceInServiceListResponseBody self = new OnsInstanceInServiceListResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsInstanceInServiceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsInstanceInServiceListResponseBody setData(java.util.List<OnsInstanceInServiceListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<OnsInstanceInServiceListResponseBodyData> getData() {
        return this.data;
    }

    public static class OnsInstanceInServiceListResponseBodyDataTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static OnsInstanceInServiceListResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            OnsInstanceInServiceListResponseBodyDataTags self = new OnsInstanceInServiceListResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public OnsInstanceInServiceListResponseBodyDataTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public OnsInstanceInServiceListResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class OnsInstanceInServiceListResponseBodyData extends TeaModel {
        @NameInMap("IndependentNaming")
        public Boolean independentNaming;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("ReleaseTime")
        public Long releaseTime;

        @NameInMap("InstanceStatus")
        public Integer instanceStatus;

        @NameInMap("Tags")
        public java.util.List<OnsInstanceInServiceListResponseBodyDataTags> tags;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public Integer instanceType;

        public static OnsInstanceInServiceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsInstanceInServiceListResponseBodyData self = new OnsInstanceInServiceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsInstanceInServiceListResponseBodyData setIndependentNaming(Boolean independentNaming) {
            this.independentNaming = independentNaming;
            return this;
        }
        public Boolean getIndependentNaming() {
            return this.independentNaming;
        }

        public OnsInstanceInServiceListResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public OnsInstanceInServiceListResponseBodyData setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public OnsInstanceInServiceListResponseBodyData setInstanceStatus(Integer instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public Integer getInstanceStatus() {
            return this.instanceStatus;
        }

        public OnsInstanceInServiceListResponseBodyData setTags(java.util.List<OnsInstanceInServiceListResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<OnsInstanceInServiceListResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public OnsInstanceInServiceListResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsInstanceInServiceListResponseBodyData setInstanceType(Integer instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Integer getInstanceType() {
            return this.instanceType;
        }

    }

}
