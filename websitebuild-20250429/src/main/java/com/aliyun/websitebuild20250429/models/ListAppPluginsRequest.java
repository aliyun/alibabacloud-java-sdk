// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppPluginsRequest extends TeaModel {
    /**
     * <p>The business ID of the application instance.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250820143531000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The number of entries per query.</p>
     * <p>Valid values: 10 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. This parameter is empty if no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>0l45bkwM022Dt+rOvPi/oQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The status of the Dataset Accelerator instance. Valid values:</p>
     * <ul>
     * <li>Created: init.</li>
     * <li>Running: running.</li>
     * <li>Stopped: stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>http_whitelist</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>The platform.</p>
     * 
     * <strong>example:</strong>
     * <p>linux/amd64</p>
     */
    @NameInMap("Platform")
    public String platform;

    public static ListAppPluginsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppPluginsRequest self = new ListAppPluginsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppPluginsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListAppPluginsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAppPluginsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAppPluginsRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public ListAppPluginsRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

}
