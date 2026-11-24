// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListManifestEditTemplateRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return per page. Default value: <strong>30</strong>. Valid values: <strong>1</strong> to <strong>200</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination cursor. You do not need to specify this parameter for the first call. The value is a string in the format of page_N, where N is the page number. Pass the NextToken value returned in the previous response to retrieve the next page. If no NextToken is returned in the response, all data has been retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>page_2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListManifestEditTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListManifestEditTemplateRequest self = new ListManifestEditTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListManifestEditTemplateRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListManifestEditTemplateRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
