// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListConfigRequest extends TeaModel {
    /**
     * <p>The name of the Logtail configuration.</p>
     */
    @NameInMap("configName")
    public String configName;

    /**
     * <p>The name of the Logstore.</p>
     */
    @NameInMap("logstoreName")
    public String logstoreName;

    /**
     * <p>The line from which the query starts. Default value: 0.</p>
     */
    @NameInMap("offset")
    public Long offset;

    /**
     * <p>The number of entries per page. Maximum value: 500.</p>
     */
    @NameInMap("size")
    public Long size;

    public static ListConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigRequest self = new ListConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public ListConfigRequest setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public ListConfigRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public ListConfigRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
