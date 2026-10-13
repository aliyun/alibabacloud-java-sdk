// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListIntentionsRequest extends TeaModel {
    /**
     * <blockquote>
     * <p>Notice: This parameter is required. Select a value based on the scenario.</p>
     * </blockquote>
     * <p>The annotation data source. Valid values:</p>
     * <ul>
     * <li>1: outbound call</li>
     * <li>2: navigation</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AnnotationMissionDataSourceType")
    public Long annotationMissionDataSourceType;

    /**
     * <p>The robot ID.</p>
     * <blockquote>
     * <p>You can obtain this value from the DescribeScript operation, which corresponds to the ChatbotId parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-n7QmzrUnNe</p>
     */
    @NameInMap("BotId")
    public String botId;

    /**
     * <p>The environment. Valid values:</p>
     * <ul>
     * <li>1: private cloud</li>
     * <li>2: public cloud</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Environment")
    public Long environment;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>e5035654-1745-484a-8c5b-165f7c7bcd79</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The intent ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10717802</p>
     */
    @NameInMap("IntentId")
    public Long intentId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c5c5d8c0-c0f1-48a7-be2b-dc46006d888a</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The intent name.</p>
     * <blockquote>
     * <p>Supports fuzzy match by keyword as a filter condition.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>know</p>
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
