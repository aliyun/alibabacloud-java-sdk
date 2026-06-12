// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class SavedSearch extends TeaModel {
    /**
     * <p>The display name of the saved search.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Method</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The name of the logstore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-test-logstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>The name of the saved search.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>savedsearch-name</p>
     */
    @NameInMap("savedsearchName")
    public String savedsearchName;

    /**
     * <p>The search statement or analytic statement.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>status: 401 | SELECT remote_addr,COUNT(*) as pv GROUP by remote_addr ORDER by pv desc limit 5</p>
     */
    @NameInMap("searchQuery")
    public String searchQuery;

    /**
     * <p>The topic of the log. The default value is an empty string (&quot;&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>topic-test</p>
     */
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
