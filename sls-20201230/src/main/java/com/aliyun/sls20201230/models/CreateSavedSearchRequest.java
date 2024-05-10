// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateSavedSearchRequest extends TeaModel {
    /**
     * <p>The display name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The name of the Logstore to which the saved search belongs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>The name of the saved search. The name must be 3 to 63 characters in length.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("savedsearchName")
    public String savedsearchName;

    /**
     * <p>The query statement of the saved search. A query statement consists of a search statement and an analytic statement in the `Search statement|Analytic statement` format. For more information about search statements and analytic statements, see [Log search overview](https://help.aliyun.com/document_detail/43772.html) and [Log analysis overview](https://help.aliyun.com/document_detail/53608.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("searchQuery")
    public String searchQuery;

    /**
     * <p>The topic of the log.</p>
     */
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
