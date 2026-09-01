// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ModifyPlaybookInputOutputRequest extends TeaModel {
    /**
     * <p>The execution method for the playbook. This parameter is in the JSONObject format.</p>
     */
    @NameInMap("ExeConfig")
    public String exeConfig;

    /**
     * <p>The input parameter configuration for the playbook. This parameter is in the JSONArray format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *         &quot;typeName&quot;: &quot;String&quot;,
     *         &quot;dataClass&quot;: &quot;normal&quot;,
     *         &quot;dataType&quot;: &quot;String&quot;,
     *         &quot;description&quot;: &quot;period&quot;,
     *         &quot;example&quot;: &quot;&quot;,
     *         &quot;name&quot;: &quot;period&quot;,
     *         &quot;required&quot;: false
     *     }
     * ]</p>
     */
    @NameInMap("InputParams")
    public String inputParams;

    /**
     * <p>The language of the request and response messages.</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Playbooks do not support output parameter configurations. This parameter is fixed to an empty value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("OutputParams")
    public String outputParams;

    /**
     * <p>The type of the input parameter for the playbook.</p>
     * <ul>
     * <li><p><strong>template-ip</strong>: IP request template.</p>
     * </li>
     * <li><p><strong>template-file</strong>: file request template.</p>
     * </li>
     * <li><p><strong>template-process</strong>: process request template.</p>
     * </li>
     * <li><p><strong>custom</strong>: custom parameter.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>The UUID of the playbook.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8baa6cff-319e-4ede-97bc-xxxxxxx</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    public static ModifyPlaybookInputOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPlaybookInputOutputRequest self = new ModifyPlaybookInputOutputRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPlaybookInputOutputRequest setExeConfig(String exeConfig) {
        this.exeConfig = exeConfig;
        return this;
    }
    public String getExeConfig() {
        return this.exeConfig;
    }

    public ModifyPlaybookInputOutputRequest setInputParams(String inputParams) {
        this.inputParams = inputParams;
        return this;
    }
    public String getInputParams() {
        return this.inputParams;
    }

    public ModifyPlaybookInputOutputRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyPlaybookInputOutputRequest setOutputParams(String outputParams) {
        this.outputParams = outputParams;
        return this;
    }
    public String getOutputParams() {
        return this.outputParams;
    }

    public ModifyPlaybookInputOutputRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public ModifyPlaybookInputOutputRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

}
