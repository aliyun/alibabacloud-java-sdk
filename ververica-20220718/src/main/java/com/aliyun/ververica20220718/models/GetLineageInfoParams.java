// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetLineageInfoParams extends TeaModel {
    /**
     * <p>The depth of the data lineage.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("depth")
    public Long depth;

    /**
     * <p>The direction of the lineage. Valid values:</p>
     * <ul>
     * <li>UPSTREAM: searches for upstream operators.</li>
     * <li>DOWNSTREAM: searches for downstream operators.</li>
     * <li>BOTH: searches for both upstream and downstream operators.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Both</p>
     */
    @NameInMap("direction")
    public String direction;

    /**
     * <p>The job ID or the table ID. You can call the ListJobs operation to obtain the job ID or call the ListTables operation to obtain the table ID.</p>
     * 
     * <strong>example:</strong>
     * <p>664cc64d-5dea-4ad3-9ee4-8432a874****</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The data type of the job or table. If the id parameter is set to the job ID, the value of this parameter is the data type of the job. If the id parameter is set to the table ID, the value of this parameter is the data type of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>JOB</p>
     */
    @NameInMap("idType")
    public String idType;

    /**
     * <p>The lineage type. The value true indicates a field-level lineage. The value false indicates a table-level lineage.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isColumnLevel")
    public Boolean isColumnLevel;

    /**
     * <p>Indicates whether the table was a temporary table.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isTemporary")
    public Boolean isTemporary;

    /**
     * <p>The name of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>default-namespace</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>a14bd5d90a****</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static GetLineageInfoParams build(java.util.Map<String, ?> map) throws Exception {
        GetLineageInfoParams self = new GetLineageInfoParams();
        return TeaModel.build(map, self);
    }

    public GetLineageInfoParams setDepth(Long depth) {
        this.depth = depth;
        return this;
    }
    public Long getDepth() {
        return this.depth;
    }

    public GetLineageInfoParams setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public GetLineageInfoParams setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetLineageInfoParams setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public GetLineageInfoParams setIsColumnLevel(Boolean isColumnLevel) {
        this.isColumnLevel = isColumnLevel;
        return this;
    }
    public Boolean getIsColumnLevel() {
        return this.isColumnLevel;
    }

    public GetLineageInfoParams setIsTemporary(Boolean isTemporary) {
        this.isTemporary = isTemporary;
        return this;
    }
    public Boolean getIsTemporary() {
        return this.isTemporary;
    }

    public GetLineageInfoParams setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetLineageInfoParams setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
