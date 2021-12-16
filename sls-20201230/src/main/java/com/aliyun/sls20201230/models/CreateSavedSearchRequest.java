// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateSavedSearchRequest extends TeaModel {
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

    public static CreateSavedSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSavedSearchRequest self = new CreateSavedSearchRequest();
        return TeaModel.build(map, self);
    }

    public CreateSavedSearchRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateSavedSearchRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public CreateSavedSearchRequest setSavedsearchName(String savedsearchName) {
        this.savedsearchName = savedsearchName;
        return this;
    }
    public String getSavedsearchName() {
        return this.savedsearchName;
    }

    public CreateSavedSearchRequest setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
        return this;
    }
    public String getSearchQuery() {
        return this.searchQuery;
    }

    public CreateSavedSearchRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
