// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceInServiceListResponseBody extends TeaModel {
    /**
     * <p>The returned information about the queried instances.</p>
     */
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>CartService</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>ServiceA</p>
         */
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
        /**
         * <p>The time when the instance was created. The value of this parameter is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1640847284000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The number of consumer groups.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("GroupCount")
        public Integer groupCount;

        /**
         * <p>Indicates whether a namespace is used for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: A separate namespace is used for the instance. The identifier of each resource in the instance must be unique within the instance. However, the identifier of a resource in the instance can be the same as the identifier of a resource in another instance that uses a different namespace.</li>
         * <li><strong>false</strong>: A separate namespace is not used for the instance. The name of each resource must be globally unique within the instance and across all instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IndependentNaming")
        public Boolean independentNaming;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_188077086902****_BXSuW61e</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * <p>The name must be 3 to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The instance is being deployed. This value is valid only for Enterprise Platinum Edition instances.</li>
         * <li><strong>2</strong>: The instance has overdue payments. This value is valid only for Standard Edition instances.</li>
         * <li><strong>5</strong>: The instance is running. This value is valid only for Standard Edition instances and Enterprise Platinum Edition instances.</li>
         * <li><strong>7</strong>: The instance is being upgraded and is running. This value is valid only for Enterprise Platinum Edition instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("InstanceStatus")
        public Integer instanceStatus;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Standard Edition</li>
         * <li><strong>2</strong>: Enterprise Platinum Edition</li>
         * </ul>
         * <p>For information about the instance editions and the differences between the editions, see <a href="https://help.aliyun.com/document_detail/185261.html">Instance editions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InstanceType")
        public Integer instanceType;

        /**
         * <p>The time when the instance expires. If the instance is of Enterprise Platinum Edition, this parameter is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1551024000000</p>
         */
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        /**
         * <p>The tags that are attached to the instance.</p>
         */
        @NameInMap("Tags")
        public OnsInstanceInServiceListResponseBodyDataInstanceVOTags tags;

        /**
         * <p>The number of topics.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
