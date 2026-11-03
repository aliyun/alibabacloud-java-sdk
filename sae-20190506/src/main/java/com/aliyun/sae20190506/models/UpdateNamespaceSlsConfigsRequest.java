// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateNamespaceSlsConfigsRequest extends TeaModel {
    /**
     * <p>The short ID of the namespace. The region is not required. This parameter is recommended.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("NameSpaceShortId")
    public String nameSpaceShortId;

    /**
     * <p>The ID of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The configuration for collecting logs to Simple Log Service (SLS).</p>
     * <ul>
     * <li>To use SLS resources automatically created by Serverless App Engine (SAE): <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</li>
     * <li>To use custom SLS resources: <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</li>
     * </ul>
     * <p>The parameter settings are as follows:</p>
     * <ul>
     * <li><strong>projectName</strong>: the name of the SLS project.  </li>
     * <li><strong>logDir</strong>: the log path.</li>
     * <li><strong>logType</strong>: the log type. <strong>stdout</strong> indicates container standard output logs. Only one stdout log can be set. If it is not set, file logs are collected.</li>
     * <li><strong>logstoreName</strong>: the name of the SLS Logstore.</li>
     * <li><strong>logtailName</strong>: the name of the SLS Logtail. If this parameter is not specified, a new Logtail is created.</li>
     * </ul>
     * <p>If the SLS collection configuration remains unchanged during multiple deployments, you do not need to set this parameter (that is, the <strong>SlsConfigs</strong> field is not required in the request). If you no longer need the SLS collection feature, you must set the value of this field to an empty string (that is, set the <strong>SlsConfigs</strong> field to &quot;&quot;) in the request.</p>
     * <blockquote>
     * <p>A project automatically created with a job template is deleted when the job template is deleted. Therefore, when you select an existing project, you cannot select a project automatically created by SAE.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</p>
     */
    @NameInMap("SlsConfigs")
    public String slsConfigs;

    /**
     * <p>sls log tags</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("SlsLogEnvTags")
    public String slsLogEnvTags;

    public static UpdateNamespaceSlsConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceSlsConfigsRequest self = new UpdateNamespaceSlsConfigsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceSlsConfigsRequest setNameSpaceShortId(String nameSpaceShortId) {
        this.nameSpaceShortId = nameSpaceShortId;
        return this;
    }
    public String getNameSpaceShortId() {
        return this.nameSpaceShortId;
    }

    public UpdateNamespaceSlsConfigsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateNamespaceSlsConfigsRequest setSlsConfigs(String slsConfigs) {
        this.slsConfigs = slsConfigs;
        return this;
    }
    public String getSlsConfigs() {
        return this.slsConfigs;
    }

    public UpdateNamespaceSlsConfigsRequest setSlsLogEnvTags(String slsLogEnvTags) {
        this.slsLogEnvTags = slsLogEnvTags;
        return this;
    }
    public String getSlsLogEnvTags() {
        return this.slsLogEnvTags;
    }

}
