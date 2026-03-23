// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class SavedSearch extends TeaModel {
    /**
     * <p>快速查询显示名称。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Method统计</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>Logstore名称。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-test-logstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>快速查询名称。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>savedsearch-name</p>
     */
    @NameInMap("savedsearchName")
    public String savedsearchName;

    /**
     * <p>查询语句或者分析语句。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>status: 401 | SELECT remote_addr,COUNT(*) as pv GROUP by remote_addr ORDER by pv desc limit 5</p>
     */
    @NameInMap("searchQuery")
    public String searchQuery;

    /**
     * <p>日志主题。默认值为空字符串（&quot;&quot;）。</p>
     * 
     * <strong>example:</strong>
     * <p>topic</p>
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
