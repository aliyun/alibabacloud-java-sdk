// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceInServiceListResponseBody extends TeaModel {
    @NameInMap("Data")
    public OnsInstanceInServiceListResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0598E46F-DB06-40E2-AD7B-C45923EE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsInstanceInServiceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsInstanceInServiceListResponseBody self = new OnsInstanceInServiceListResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsInstanceInServiceListResponseBody setData(OnsInstanceInServiceListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsInstanceInServiceListResponseBodyData getData() {
        return this.data;
    }

    public OnsInstanceInServiceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("GroupCount")
        public Integer groupCount;

        @NameInMap("IndependentNaming")
        public Boolean independentNaming;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceStatus")
        public Integer instanceStatus;

        @NameInMap("InstanceType")
        public Integer instanceType;

        @NameInMap("ReleaseTime")
        public Long releaseTime;

        @NameInMap("Tags")
        public OnsInstanceInServiceListResponseBodyDataInstanceVOTags tags;

        @NameInMap("TopicCount")
        public Integer topicCount;

        public static OnsInstanceInServiceListResponseBodyDataInstanceVO build(java.util.Map<String, ?> map) throws Exception {
            OnsInstanceInServiceListResponseBodyDataInstanceVO self = new OnsInstanceInServiceListResponseBodyDataInstanceVO();
            return TeaModel.build(map, self);
        }

        public OnsInstanceInServiceListResponseBodyDataInstanceVO setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public OnsInstanceInServiceListResponseBodyDataInstanceVO setGroupCount(Integer groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Integer getGroupCount() {
            return this.groupCount;
        }

        public OnsInstanceInServiceListResponseBodyDataInstanceVO setIndependentNaming(Boolean independentNaming) {
            this.independentNaming = independentNaming;
            return this;
        }
        public Boolean getIndependentNaming() {
            return this.independentNaming;
        }

        public OnsInstanceInServiceListResponseBodyDataInstanceVO setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsInstanceInServiceListResponseBodyDataInstanceVO setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public OnsInstanceInServiceListResponseBodyDataInstanceVO setInstanceStatus(Integer instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public Integer getInstanceStatus() {
            return this.instanceStatus;
        }

        public OnsInstanceInServiceListResponseBodyDataInstanceVO setInstanceType(Integer instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Integer getInstanceType() {
            return this.instanceType;
        }

        public OnsInstanceInServiceListResponseBodyDataInstanceVO setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public OnsInstanceInServiceListResponseBodyDataInstanceVO setTags(OnsInstanceInServiceListResponseBodyDataInstanceVOTags tags) {
            this.tags = tags;
            return this;
        }
        public OnsInstanceInServiceListResponseBodyDataInstanceVOTags getTags() {
            return this.tags;
        }

        public OnsInstanceInServiceListResponseBodyDataInstanceVO setTopicCount(Integer topicCount) {
            this.topicCount = topicCount;
            return this;
        }
        public Integer getTopicCount() {
            return this.topicCount;
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
