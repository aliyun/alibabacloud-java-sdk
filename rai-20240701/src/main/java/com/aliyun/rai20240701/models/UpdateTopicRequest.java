// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class UpdateTopicRequest extends TeaModel {
    @NameInMap("BodyData")
    public UpdateTopicRequestBodyData bodyData;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TopicDefinition")
    public String topicDefinition;

    /**
     * <strong>example:</strong>
     * <p>216</p>
     */
    @NameInMap("TopicId")
    public Long topicId;

    @NameInMap("TopicName")
    public String topicName;

    public static UpdateTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTopicRequest self = new UpdateTopicRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTopicRequest setBodyData(UpdateTopicRequestBodyData bodyData) {
        this.bodyData = bodyData;
        return this;
    }
    public UpdateTopicRequestBodyData getBodyData() {
        return this.bodyData;
    }

    public UpdateTopicRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateTopicRequest setTopicDefinition(String topicDefinition) {
        this.topicDefinition = topicDefinition;
        return this;
    }
    public String getTopicDefinition() {
        return this.topicDefinition;
    }

    public UpdateTopicRequest setTopicId(Long topicId) {
        this.topicId = topicId;
        return this;
    }
    public Long getTopicId() {
        return this.topicId;
    }

    public UpdateTopicRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

    public static class UpdateTopicRequestBodyDataTopicExampleInfoList extends TeaModel {
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExampleType")
        public Integer exampleType;

        public static UpdateTopicRequestBodyDataTopicExampleInfoList build(java.util.Map<String, ?> map) throws Exception {
            UpdateTopicRequestBodyDataTopicExampleInfoList self = new UpdateTopicRequestBodyDataTopicExampleInfoList();
            return TeaModel.build(map, self);
        }

        public UpdateTopicRequestBodyDataTopicExampleInfoList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateTopicRequestBodyDataTopicExampleInfoList setExampleType(Integer exampleType) {
            this.exampleType = exampleType;
            return this;
        }
        public Integer getExampleType() {
            return this.exampleType;
        }

    }

    public static class UpdateTopicRequestBodyData extends TeaModel {
        @NameInMap("TopicExampleInfoList")
        public java.util.List<UpdateTopicRequestBodyDataTopicExampleInfoList> topicExampleInfoList;

        public static UpdateTopicRequestBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateTopicRequestBodyData self = new UpdateTopicRequestBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateTopicRequestBodyData setTopicExampleInfoList(java.util.List<UpdateTopicRequestBodyDataTopicExampleInfoList> topicExampleInfoList) {
            this.topicExampleInfoList = topicExampleInfoList;
            return this;
        }
        public java.util.List<UpdateTopicRequestBodyDataTopicExampleInfoList> getTopicExampleInfoList() {
            return this.topicExampleInfoList;
        }

    }

}
