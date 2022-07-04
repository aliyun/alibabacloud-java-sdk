// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateSavedSearchRequest extends TeaModel {
    @NameInMap("displayName")
    public String displayName;

    @NameInMap("logstore")
    public String logstore;

    @NameInMap("savedsearchName")
    public String savedsearchName;

    @NameInMap("searchQuery")
    public String searchQuery;

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
