// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinklogKnowledgefeedbackRequest extends TeaModel {
    @NameInMap("KnowledgeFeedbackVOJsonStr")
    public String knowledgeFeedbackVOJsonStr;

    @NameInMap("KnowledgeId")
    public String knowledgeId;

    @NameInMap("LogId")
    public String logId;

    @NameInMap("StoreId")
    public String storeId;

    public static ExecLinkeLinklogKnowledgefeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinklogKnowledgefeedbackRequest self = new ExecLinkeLinklogKnowledgefeedbackRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinklogKnowledgefeedbackRequest setKnowledgeFeedbackVOJsonStr(String knowledgeFeedbackVOJsonStr) {
        this.knowledgeFeedbackVOJsonStr = knowledgeFeedbackVOJsonStr;
        return this;
    }
    public String getKnowledgeFeedbackVOJsonStr() {
        return this.knowledgeFeedbackVOJsonStr;
    }

    public ExecLinkeLinklogKnowledgefeedbackRequest setKnowledgeId(String knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public String getKnowledgeId() {
        return this.knowledgeId;
    }

    public ExecLinkeLinklogKnowledgefeedbackRequest setLogId(String logId) {
        this.logId = logId;
        return this;
    }
    public String getLogId() {
        return this.logId;
    }

    public ExecLinkeLinklogKnowledgefeedbackRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
