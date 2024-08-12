// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListLabelsRequest extends TeaModel {
    @NameInMap("LabelContent")
    public String labelContent;

    @NameInMap("LabelId")
    public String labelId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    public static ListLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLabelsRequest self = new ListLabelsRequest();
        return TeaModel.build(map, self);
    }

    public ListLabelsRequest setLabelContent(String labelContent) {
        this.labelContent = labelContent;
        return this;
    }
    public String getLabelContent() {
        return this.labelContent;
    }

    public ListLabelsRequest setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

    public ListLabelsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListLabelsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
