// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListIntentionsRequest extends TeaModel {
    /**
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is required. Select based on the scenario.</p>
     * <p>Annotation data source.</p>
     * <ul>
     * <li><p>1: Outbound Call</p>
     * </li>
     * <li><p>2: Navigation</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AnnotationMissionDataSourceType")
    public Long annotationMissionDataSourceType;

    /**
     * <p>Bot ID</p>
     * <blockquote>
     * <p>Get this from the DescribeScript API. The corresponding parameter is ChatbotId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-n7QmzrUnNe</p>
     */
    @NameInMap("BotId")
    public String botId;

    /**
     * <p>Environment</p>
     * <ul>
     * <li><p>1: Private Cloud</p>
     * </li>
     * <li><p>2: Public Cloud</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Environment")
    public Long environment;

    /**
     * <p>Instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>e5035654-1745-484a-8c5b-165f7c7bcd79</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Intent ID</p>
     * 
     * <strong>example:</strong>
     * <p>10717802</p>
     */
    @NameInMap("IntentId")
    public Long intentId;

    /**
     * <p>Page Number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>Number.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Scenario ID</p>
     * 
     * <strong>example:</strong>
     * <p>c5c5d8c0-c0f1-48a7-be2b-dc46006d888a</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>Intent Name</p>
     * <blockquote>
     * <p>Use this for fuzzy queries based on keywords.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>知道</p>
     */
    @NameInMap("UserNick")
    public String userNick;

    public static ListIntentionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIntentionsRequest self = new ListIntentionsRequest();
        return TeaModel.build(map, self);
    }

    public ListIntentionsRequest setAnnotationMissionDataSourceType(Long annotationMissionDataSourceType) {
        this.annotationMissionDataSourceType = annotationMissionDataSourceType;
        return this;
    }
    public Long getAnnotationMissionDataSourceType() {
        return this.annotationMissionDataSourceType;
    }

    public ListIntentionsRequest setBotId(String botId) {
        this.botId = botId;
        return this;
    }
    public String getBotId() {
        return this.botId;
    }

    public ListIntentionsRequest setEnvironment(Long environment) {
        this.environment = environment;
        return this;
    }
    public Long getEnvironment() {
        return this.environment;
    }

    public ListIntentionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListIntentionsRequest setIntentId(Long intentId) {
        this.intentId = intentId;
        return this;
    }
    public Long getIntentId() {
        return this.intentId;
    }

    public ListIntentionsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListIntentionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListIntentionsRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public ListIntentionsRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

}
