// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetDatabaseObjectsByNameAndTagsRequest extends TeaModel {
    // 数据库名称模式
    @NameInMap("DbNamePattern")
    public String dbNamePattern;

    // 不包含的标签模式
    @NameInMap("ExcludeTagPattern")
    public String excludeTagPattern;

    // 包含的标签模式
    @NameInMap("IncludeTagPattern")
    public String includeTagPattern;

    // 分页开始位置
    @NameInMap("PageStart")
    public Long pageStart;

    // 分页结束位置
    @NameInMap("PageEnd")
    public Long pageEnd;

    public static GetDatabaseObjectsByNameAndTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseObjectsByNameAndTagsRequest self = new GetDatabaseObjectsByNameAndTagsRequest();
        return TeaModel.build(map, self);
    }

    public GetDatabaseObjectsByNameAndTagsRequest setDbNamePattern(String dbNamePattern) {
        this.dbNamePattern = dbNamePattern;
        return this;
    }
    public String getDbNamePattern() {
        return this.dbNamePattern;
    }

    public GetDatabaseObjectsByNameAndTagsRequest setExcludeTagPattern(String excludeTagPattern) {
        this.excludeTagPattern = excludeTagPattern;
        return this;
    }
    public String getExcludeTagPattern() {
        return this.excludeTagPattern;
    }

    public GetDatabaseObjectsByNameAndTagsRequest setIncludeTagPattern(String includeTagPattern) {
        this.includeTagPattern = includeTagPattern;
        return this;
    }
    public String getIncludeTagPattern() {
        return this.includeTagPattern;
    }

    public GetDatabaseObjectsByNameAndTagsRequest setPageStart(Long pageStart) {
        this.pageStart = pageStart;
        return this;
    }
    public Long getPageStart() {
        return this.pageStart;
    }

    public GetDatabaseObjectsByNameAndTagsRequest setPageEnd(Long pageEnd) {
        this.pageEnd = pageEnd;
        return this;
    }
    public Long getPageEnd() {
        return this.pageEnd;
    }

}
