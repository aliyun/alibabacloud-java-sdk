// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <strong>example:</strong>
     * <p>{     &quot;nodes&quot;: [         {             &quot;id&quot;: &quot;id-4c50-1609236241393-76174&quot;,             &quot;name&quot;: &quot;读数据表&quot;,             &quot;metadata&quot;: {                 &quot;identifier&quot;: &quot;data_source&quot;,                 &quot;version&quot;: &quot;v1&quot;,                 &quot;provider&quot;: &quot;pai&quot;             },             &quot;properties&quot;: [                 {                     &quot;name&quot;: &quot;hasPartition&quot;,                     &quot;value&quot;: false                 },                 {                     &quot;name&quot;: &quot;inputTableName&quot;,                     &quot;value&quot;: &quot;pai_online_project.e_commerce_test_data&quot;                 }             ],             &quot;position&quot;: {                 &quot;x&quot;: 427,                 &quot;y&quot;: 123             }         },         {             &quot;id&quot;: &quot;id-23ce-1609236252041-30106&quot;,             &quot;name&quot;: &quot;读数据表&quot;,             &quot;metadata&quot;: {                 &quot;identifier&quot;: &quot;data_source&quot;,                 &quot;version&quot;: &quot;v1&quot;,                 &quot;provider&quot;: &quot;pai&quot;             },             &quot;properties&quot;: [                 {                     &quot;name&quot;: &quot;inputTableName&quot;,                     &quot;value&quot;: &quot;pai_online_project.e_commerce_train_data&quot;                 },                 {                     &quot;name&quot;: &quot;hasPartition&quot;,                     &quot;value&quot;: false                 }             ],             &quot;position&quot;: {                 &quot;x&quot;: 226,                 &quot;y&quot;: 127             }         },         {             &quot;id&quot;: &quot;id-97a7-1609236275421-84245&quot;,             &quot;name&quot;: &quot;DeepFM&quot;,             &quot;metadata&quot;: {                 &quot;identifier&quot;: &quot;deepfm&quot;,                 &quot;version&quot;: &quot;v1&quot;,                 &quot;provider&quot;: &quot;pai&quot;             },             &quot;properties&quot;: [                 {                     &quot;name&quot;: &quot;trainModel&quot;,                     &quot;value&quot;: &quot;train&quot;                 },                 {                     &quot;name&quot;: &quot;arn&quot;,                     &quot;value&quot;: true                 },                 {                     &quot;name&quot;: &quot;cluster&quot;,                     &quot;value&quot;: &quot;\n{\n    &quot;ps&quot;: {\n        &quot;count&quot;: 2,\n        &quot;cpu&quot;: 1000,\n        &quot;memory&quot;: 40000\n    },\n    &quot;worker&quot;: {\n        &quot;count&quot;: 8,\n        &quot;cpu&quot;: 1000,\n        &quot;memory&quot;: 40000\n    }\n}&quot;                 }             ],             &quot;position&quot;: {                 &quot;x&quot;: 323,                 &quot;y&quot;: 345             }         }     ],     &quot;edges&quot;: [         {             &quot;source&quot;: &quot;id-23ce-1609236252041-30106&quot;,             &quot;sourceAnchor&quot;: &quot;outputTable&quot;,             &quot;targetAnchor&quot;: &quot;input1TableName&quot;,             &quot;target&quot;: &quot;id-97a7-1609236275421-84245&quot;         },         {             &quot;source&quot;: &quot;id-4c50-1609236241393-76174&quot;,             &quot;sourceAnchor&quot;: &quot;outputTable&quot;,             &quot;targetAnchor&quot;: &quot;input2TableName&quot;,             &quot;target&quot;: &quot;id-97a7-1609236275421-84245&quot;         }     ],     &quot;globalParams&quot;: [],     &quot;globalSettings&quot;: []  }</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>1326689413376250</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <strong>example:</strong>
     * <p>Pipeline Draft Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>draft-rbvg5wzljzjhc9ks92</p>
     */
    @NameInMap("ExperimentId")
    public String experimentId;

    /**
     * <strong>example:</strong>
     * <p>2021-01-30T12:51:33.028Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-30T12:51:33.028Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <strong>example:</strong>
     * <p>Pipeline Draft Name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>{&quot;mlflow&quot;:{&quot;experimentId&quot;:&quot;exp-1&quot;}}</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <strong>example:</strong>
     * <p>DD405810-73C9-5721-996A-EA04BCC4BBF2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>PaiStudio</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Version")
    public Long version;

    /**
     * <strong>example:</strong>
     * <p>23487</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentResponseBody self = new GetExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExperimentResponseBody setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetExperimentResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetExperimentResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetExperimentResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetExperimentResponseBody setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public GetExperimentResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetExperimentResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetExperimentResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetExperimentResponseBody setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public GetExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExperimentResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetExperimentResponseBody setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public GetExperimentResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
