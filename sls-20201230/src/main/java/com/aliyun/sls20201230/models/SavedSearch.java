// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class SavedSearch extends TeaModel {
    // displayName
    @NameInMap("displayName")
    public String displayName;

    // logstore
    @NameInMap("logstore")
    public String logstore;

    // savedsearchName
    @NameInMap("savedsearchName")
    public String savedsearchName;

    // searchQuery
    @NameInMap("searchQuery")
    public String searchQuery;

    // topic
    @NameInMap("topic")
    public String topic;

    public static SavedSearch build(java.util.Map<String, ?> map) throws Exception {
        SavedSearch self = new SavedSearch();
        return TeaModel.build(map, self);
    }

    public SavedSearch setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public SavedSearch setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public SavedSearch setSavedsearchName(String savedsearchName) {
        this.savedsearchName = savedsearchName;
        return this;
    }
    public String getSavedsearchName() {
        return this.savedsearchName;
    }

    public SavedSearch setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
        return this;
    }
    public String getSearchQuery() {
        return this.searchQuery;
    }

    public SavedSearch setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
