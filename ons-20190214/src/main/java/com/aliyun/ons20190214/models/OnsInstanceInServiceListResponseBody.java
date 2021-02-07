// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceInServiceListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsInstanceInServiceListResponseBodyData data;

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

    public OnsInstanceInServiceListResponseBody setData(OnsInstanceInServiceListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsInstanceInServiceListResponseBodyData getData() {
        return this.data;
    }

    public static class OnsInstanceInServiceListResponseBodyDataInstanceVOTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static OnsInstanceInServiceListResponseBodyDataInstanceVOTagsTag build(java.util.Map<String, ?> map) throws Exception {
            OnsInstanceInServiceListResponseBodyDataInstanceVOTagsTag self = new OnsInstanceInServiceListResponseBodyDataInstanceVOTagsTag();
            return TeaModel.build(map, self);
        }

        public OnsInstanceInServiceListResponseBodyDataInstanceVOTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public OnsInstanceInServiceListResponseBodyDataInstanceVOTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class OnsInstanceInServiceListResponseBodyDataInstanceVOTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<OnsInstanceInServiceListResponseBodyDataInstanceVOTagsTag> tag;

        public static OnsInstanceInServiceListResponseBodyDataInstanceVOTags build(java.util.Map<String, ?> map) throws Exception {
            OnsInstanceInServiceListResponseBodyDataInstanceVOTags self = new OnsInstanceInServiceListResponseBodyDataInstanceVOTags();
            return TeaModel.build(map, self);
        }

        public OnsInstanceInServiceListResponseBodyDataInstanceVOTags setTag(java.util.List<OnsInstanceInServiceListResponseBodyDataInstanceVOTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<OnsInstanceInServiceListResponseBodyDataInstanceVOTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class OnsInstanceInServiceListResponseBodyDataInstanceVO extends TeaModel {
        @NameInMap("IndependentNaming")
        public Boolean independentNaming;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("ReleaseTime")
        public Long releaseTime;

        @NameInMap("InstanceStatus")
        public Integer instanceStatus;

        @NameInMap("Tags")
        public OnsInstanceInServiceListResponseBodyDataInstanceVOTags tags;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public Integer instanceType;

        public static OnsInstanceInServiceListResponseBodyDataInstanceVO build(java.util.Map<String, ?> map) throws Exception {
            OnsInstanceInServiceListResponseBodyDataInstanceVO self = new OnsInstanceInServiceListResponseBodyDataInstanceVO();
            return TeaModel.build(map, self);
        }

        public OnsInstanceInServiceListResponseBodyDataInstanceVO setIndependentNaming(Boolean independentNaming) {
            this.independentNaming = independentNaming;
            return this;
        }
        public Boolean getIndependentNaming() {
            return this.independentNaming;
        }

        public OnsInstanceInServiceListResponseBodyDataInstanceVO setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public OnsInstanceInServiceListResponseBodyDataInstanceVO setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public OnsInstanceInServiceListResponseBodyDataInstanceVO setInstanceStatus(Integer instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public Integer getInstanceStatus() {
            return this.instanceStatus;
        }

        public OnsInstanceInServiceListResponseBodyDataInstanceVO setTags(OnsInstanceInServiceListResponseBodyDataInstanceVOTags tags) {
            this.tags = tags;
            return this;
        }
        public OnsInstanceInServiceListResponseBodyDataInstanceVOTags getTags() {
            return this.tags;
        }

        public OnsInstanceInServiceListResponseBodyDataInstanceVO setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsInstanceInServiceListResponseBodyDataInstanceVO setInstanceType(Integer instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Integer getInstanceType() {
            return this.instanceType;
        }

    }

    public static class OnsInstanceInServiceListResponseBodyData extends TeaModel {
        @NameInMap("InstanceVO")
        public java.util.List<OnsInstanceInServiceListResponseBodyDataInstanceVO> instanceVO;

        public static OnsInstanceInServiceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsInstanceInServiceListResponseBodyData self = new OnsInstanceInServiceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsInstanceInServiceListResponseBodyData setInstanceVO(java.util.List<OnsInstanceInServiceListResponseBodyDataInstanceVO> instanceVO) {
            this.instanceVO = instanceVO;
            return this;
        }
        public java.util.List<OnsInstanceInServiceListResponseBodyDataInstanceVO> getInstanceVO() {
            return this.instanceVO;
        }

    }

}
