// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateIndexRequest extends TeaModel {
    @NameInMap("content")
    public String content;

    @NameInMap("dataSource")
    public String dataSource;

    @NameInMap("domain")
    public String domain;

    @NameInMap("name")
    public String name;

    @NameInMap("partition")
    public Integer partition;

    public static CreateIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIndexRequest self = new CreateIndexRequest();
        return TeaModel.build(map, self);
    }

    public CreateIndexRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateIndexRequest setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public CreateIndexRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateIndexRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateIndexRequest setPartition(Integer partition) {
        this.partition = partition;
        return this;
    }
    public Integer getPartition() {
        return this.partition;
    }

}
