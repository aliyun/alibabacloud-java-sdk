// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebPathRequest extends TeaModel {
    /**
     * <p>The configuration of the web directory. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><strong>webPathType</strong>: the type of the web directory</li>
     * <li><strong>webPath</strong>: the web directory</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;webPathType&quot;: &quot;customize&quot;,
     *       &quot;webPath&quot;: &quot;/root/www****&quot;
     * }</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The protected asset to which the web directory belongs. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><strong>target</strong>: the protected asset.</li>
     * <li><strong>targetType</strong>: the type of the asset. Set the value to uuid.</li>
     * <li><strong>flag</strong>: the type of the operation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;target&quot;:&quot;0186127a-d33e-4d0c-94fb-8f25f87bc69f&quot;,&quot;targetType&quot;:&quot;uuid&quot;,&quot;flag&quot;:&quot;add&quot;}]</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The type of the configuration item. Set the value to <strong>web_path</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>web_path</p>
     */
    @NameInMap("Type")
    public String type;

    public static ModifyWebPathRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebPathRequest self = new ModifyWebPathRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebPathRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyWebPathRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public ModifyWebPathRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
