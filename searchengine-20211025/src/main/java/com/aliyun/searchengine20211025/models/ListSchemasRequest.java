// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListSchemasRequest extends TeaModel {
    /**
     * <p>AK</p>
     * 
     * <strong>example:</strong>
     * <p>ak</p>
     */
    @NameInMap("accessKey")
    public String accessKey;

    /**
     * <p>AS</p>
     * 
     * <strong>example:</strong>
     * <p>as</p>
     */
    @NameInMap("accessSecret")
    public String accessSecret;

    /**
     * <p>odps endpoint</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api">http://service.cn-hangzhou.maxcompute.aliyun-inc.com/api</a></p>
     */
    @NameInMap("endpoint")
    public String endpoint;

    /**
     * <strong>example:</strong>
     * <p>igraph-cn-tl32wnrhi04</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <strong>example:</strong>
     * <p>dt=20230520</p>
     */
    @NameInMap("partition")
    public String partition;

    /**
     * <strong>example:</strong>
     * <p>start-flask-v3-obcc</p>
     */
    @NameInMap("project")
    public String project;

    /**
     * <strong>example:</strong>
     * <p>item</p>
     */
    @NameInMap("table")
    public String table;

    /**
     * <p>odps, swift, saro, oss, unKnow</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>odps</p>
     */
    @NameInMap("type")
    public String type;

    public static ListSchemasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSchemasRequest self = new ListSchemasRequest();
        return TeaModel.build(map, self);
    }

    public ListSchemasRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public ListSchemasRequest setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }
    public String getAccessSecret() {
        return this.accessSecret;
    }

    public ListSchemasRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public ListSchemasRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListSchemasRequest setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

    public ListSchemasRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public ListSchemasRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

    public ListSchemasRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
