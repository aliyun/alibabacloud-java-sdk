// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class CountDatabasesByNameAndTagsRequest extends TeaModel {
    // 数据库名称模式
    @NameInMap("DbNamePattern")
    public String dbNamePattern;

    // 不包含的标签模式
    @NameInMap("ExcludeTagPattern")
    public String excludeTagPattern;

    // 包含的标签模式
    @NameInMap("IncludeTagPattern")
    public String includeTagPattern;

    public static CountDatabasesByNameAndTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        CountDatabasesByNameAndTagsRequest self = new CountDatabasesByNameAndTagsRequest();
        return TeaModel.build(map, self);
    }

    public CountDatabasesByNameAndTagsRequest setDbNamePattern(String dbNamePattern) {
        this.dbNamePattern = dbNamePattern;
        return this;
    }
    public String getDbNamePattern() {
        return this.dbNamePattern;
    }

    public CountDatabasesByNameAndTagsRequest setExcludeTagPattern(String excludeTagPattern) {
        this.excludeTagPattern = excludeTagPattern;
        return this;
    }
    public String getExcludeTagPattern() {
        return this.excludeTagPattern;
    }

    public CountDatabasesByNameAndTagsRequest setIncludeTagPattern(String includeTagPattern) {
        this.includeTagPattern = includeTagPattern;
        return this;
    }
    public String getIncludeTagPattern() {
        return this.includeTagPattern;
    }

}
