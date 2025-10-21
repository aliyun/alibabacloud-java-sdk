// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class CreateTopicRequest extends TeaModel {
    @NameInMap("BodyData")
    public CreateTopicRequestBodyData bodyData;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TopicDefinition")
    public String topicDefinition;

    @NameInMap("TopicName")
    public String topicName;

    /**
     * <strong>example:</strong>
     * <p>643168</p>
     */
    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static CreateTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTopicRequest self = new CreateTopicRequest();
        return TeaModel.build(map, self);
    }

    public CreateTopicRequest setBodyData(CreateTopicRequestBodyData bodyData) {
        this.bodyData = bodyData;
        return this;
    }
    public CreateTopicRequestBodyData getBodyData() {
        return this.bodyData;
    }

    public CreateTopicRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTopicRequest setTopicDefinition(String topicDefinition) {
        this.topicDefinition = topicDefinition;
        return this;
    }
    public String getTopicDefinition() {
        return this.topicDefinition;
    }

    public CreateTopicRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

    public CreateTopicRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateTopicRequestBodyDataTopicExampleInfoList extends TeaModel {
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExampleType")
        public Integer exampleType;

        public static CreateTopicRequestBodyDataTopicExampleInfoList build(java.util.Map<String, ?> map) throws Exception {
            CreateTopicRequestBodyDataTopicExampleInfoList self = new CreateTopicRequestBodyDataTopicExampleInfoList();
            return TeaModel.build(map, self);
        }

        public CreateTopicRequestBodyDataTopicExampleInfoList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateTopicRequestBodyDataTopicExampleInfoList setExampleType(Integer exampleType) {
            this.exampleType = exampleType;
            return this;
        }
        public Integer getExampleType() {
            return this.exampleType;
        }

    }

    public static class CreateTopicRequestBodyData extends TeaModel {
        @NameInMap("TopicExampleInfoList")
        public java.util.List<CreateTopicRequestBodyDataTopicExampleInfoList> topicExampleInfoList;

        public static CreateTopicRequestBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTopicRequestBodyData self = new CreateTopicRequestBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTopicRequestBodyData setTopicExampleInfoList(java.util.List<CreateTopicRequestBodyDataTopicExampleInfoList> topicExampleInfoList) {
            this.topicExampleInfoList = topicExampleInfoList;
            return this;
        }
        public java.util.List<CreateTopicRequestBodyDataTopicExampleInfoList> getTopicExampleInfoList() {
            return this.topicExampleInfoList;
        }

    }

}
