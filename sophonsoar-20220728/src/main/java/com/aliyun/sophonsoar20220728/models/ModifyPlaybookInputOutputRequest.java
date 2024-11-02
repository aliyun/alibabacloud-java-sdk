// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ModifyPlaybookInputOutputRequest extends TeaModel {
    /**
     * <p>The executed mode of a playbook. The value is a JSON array.</p>
     */
    @NameInMap("ExeConfig")
    public String exeConfig;

    /**
     * <p>The configuration of the input parameters. The value is a JSON array.</p>
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
     * <p>The language of the content within the request and response.</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese (default)</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The configuration of the output parameters. This parameter is unavailable. Leave it empty.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("OutputParams")
    public String outputParams;

    /**
     * <p>The input parameter type.</p>
     * <ul>
     * <li><strong>template-ip</strong></li>
     * <li><strong>template-file</strong></li>
     * <li><strong>template-process</strong></li>
     * <li><strong>custom</strong></li>
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
     * <p> You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a>operation to query the playbook UUID.</p>
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
