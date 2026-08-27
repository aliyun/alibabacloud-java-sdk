// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetGraphSchemaResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The graph name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("graphName")
    public String graphName;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The active QueryAgent registered schema ID corresponding to the graph. The value is null if not yet registered.</p>
     * 
     * <strong>example:</strong>
     * <p>schema_123456</p>
     */
    @NameInMap("schemaId")
    public String schemaId;

    /**
     * <p>The version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("schemaVersion")
    public String schemaVersion;

    /**
     * <p>The raw YAML text of the Graph Schema trimmed by READ permissions, retaining $ref references within the authorized subgraph.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("yamlEdit")
    public String yamlEdit;

    public static GetGraphSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGraphSchemaResponseBody self = new GetGraphSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGraphSchemaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGraphSchemaResponseBody setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public GetGraphSchemaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGraphSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGraphSchemaResponseBody setSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public String getSchemaId() {
        return this.schemaId;
    }

    public GetGraphSchemaResponseBody setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public GetGraphSchemaResponseBody setYamlEdit(String yamlEdit) {
        this.yamlEdit = yamlEdit;
        return this;
    }
    public String getYamlEdit() {
        return this.yamlEdit;
    }

}
