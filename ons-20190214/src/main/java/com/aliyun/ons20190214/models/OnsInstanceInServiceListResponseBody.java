// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceInServiceListResponseBody extends TeaModel {
    /**
     * <p>The returned list of all published instances.</p>
     */
    @NameInMap("Data")
    public OnsInstanceInServiceListResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
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
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
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
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Indicates whether the instance uses a namespace. Valid values:</p>
         * <br>
         * <p>*   **true**: The instance uses a separate namespace. The name of each resource must be unique in the instance. The names of resources in different instances can be the same.</p>
         * <p>*   **false**: The instance does not use a separate namespace. The name of each resource must be globally unique within and across all instances.</p>
         */
        @NameInMap("IndependentNaming")
        public Boolean independentNaming;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         * <br>
         * <p>The name must be 3 to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (\_).</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <br>
         * <p>*   **0**: The instance is being deployed. This value is valid only for Enterprise Platinum Edition instances.</p>
         * <p>*   **2**: The instance has overdue payments. This value is valid only for Standard Edition instances.</p>
         * <p>*   **5**: The instance is running. This value is valid for Standard Edition instances and Enterprise Platinum Edition instances.</p>
         * <p>*   **7**: The instance is being upgraded and is running. This value is valid only for Enterprise Platinum Edition instances.</p>
         */
        @NameInMap("InstanceStatus")
        public Integer instanceStatus;

        /**
         * <p>The instance type. Valid values:</p>
         * <br>
         * <p>*   **1**: Standard Edition</p>
         * <p>*   **2**: Enterprise Platinum Edition</p>
         * <br>
         * <p>For more information about the instance editions and differences between the editions, see [Instance editions](~~185261~~).</p>
         */
        @NameInMap("InstanceType")
        public Integer instanceType;

        /**
         * <p>The point in time when the instance expires. If the instance is an Enterprise Platinum Edition instance, this parameter is returned.</p>
         */
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        /**
         * <p>The tags that are attached to the instance.</p>
         */
        @NameInMap("Tags")
        public OnsInstanceInServiceListResponseBodyDataInstanceVOTags tags;

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
