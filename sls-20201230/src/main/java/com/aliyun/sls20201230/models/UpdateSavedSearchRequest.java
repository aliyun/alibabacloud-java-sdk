// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateSavedSearchRequest extends TeaModel {
    /**
     * <p>The display name.</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The name of the Logstore to which the saved search belongs.</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>The name of the saved search. The name must be 3 to 63 characters in length.</p>
     */
    @NameInMap("savedsearchName")
    public String savedsearchName;

    /**
     * <p>The search statement or the query statement of the saved search. A query statement consists of a search statement and an analytic statement in the Search statement|Analytic statement format.</p>
     * <br>
     * <p>For more information, see Log search overview and Log analysis overview.</p>
     */
    @NameInMap("searchQuery")
    public String searchQuery;

    /**
     * <p>The topic of the logs.</p>
     */
    @NameInMap("topic")
    public String topic;

    public static UpdateSavedSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSavedSearchRequest self = new UpdateSavedSearchRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSavedSearchRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateSavedSearchRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public UpdateSavedSearchRequest setSavedsearchName(String savedsearchName) {
        this.savedsearchName = savedsearchName;
        return this;
    }
    public String getSavedsearchName() {
        return this.savedsearchName;
    }

    public UpdateSavedSearchRequest setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
        return this;
    }
    public String getSearchQuery() {
        return this.searchQuery;
    }

    public UpdateSavedSearchRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
