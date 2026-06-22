// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyLoginBaseConfigRequest extends TeaModel {
    /**
     * <p>The detailed configuration of the unusual logon detection rule for the server. This parameter is in JSON format and contains the following fields:</p>
     * <ul>
     * <li><strong>totalCount</strong>: the total number of assets.</li>
     * <li><strong>uuidCount</strong>: the number of assets on which the rule takes effect.</li>
     * <li><strong>id</strong>: the ID of the unusual logon detection rule.</li>
     * <li><strong>location</strong>: the name of the common logon location.</li>
     * </ul>
     * <blockquote>
     * <p>This field is required only when the Type parameter is set to login_common_location.</p>
     * </blockquote>
     * <ul>
     * <li><strong>ip</strong>: the common logon IP address.</li>
     * </ul>
     * <blockquote>
     * <p>This field is required only when the Type parameter is set to login_common_ip.</p>
     * </blockquote>
     * <ul>
     * <li><strong>endTime</strong>: the end time of the common logon time range.</li>
     * </ul>
     * <blockquote>
     * <p>This field is required only when the Type parameter is set to login_common_time.</p>
     * </blockquote>
     * <ul>
     * <li><strong>startTime</strong>: the start time of the common logon time range.</li>
     * </ul>
     * <blockquote>
     * <p>This field is required only when the Type parameter is set to login_common_time.</p>
     * </blockquote>
     * <ul>
     * <li><strong>account</strong>: the common logon account.</li>
     * </ul>
     * <blockquote>
     * <p>This field is required only when the Type parameter is set to login_common_account.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;totalCount&quot;:174,&quot;uuidCount&quot;:4,&quot;location&quot;:&quot;黑山&quot;,&quot;id&quot;:0}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The configuration of the servers on which the unusual logon detection rule takes effect. This parameter is in JSON format and contains the following fields:</p>
     * <ul>
     * <li><strong>Target</strong>: the UUID of the server to add or remove.</li>
     * <li><strong>targetType</strong>: the mode for adding assets on which the rule takes effect. Valid values:<ul>
     * <li><strong>uuid</strong>: add by individual server.</li>
     * <li><strong>groupId</strong>: add by server group.</li>
     * </ul>
     * </li>
     * <li><strong>flag</strong>: the operation to perform on the asset. Valid values:<ul>
     * <li><strong>del</strong>: remove the server from the rule.</li>
     * <li><strong>add</strong>: add the server to the rule.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;target&quot;:&quot;inet-7c676676-06fa-442e-90fb-b802e5d6****&quot;,&quot;targetType&quot;:&quot;uuid&quot;,&quot;flag&quot;:&quot;add&quot;}]</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The type of unusual logon detection for the server. Valid values:</p>
     * <ul>
     * <li><strong>login_common_location</strong>: common logon location.</li>
     * <li><strong>login_common_ip</strong>: common logon IP address.</li>
     * <li><strong>login_common_time</strong>: common logon time.</li>
     * <li><strong>login_common_account</strong>: common logon account.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>login_common_location</p>
     */
    @NameInMap("Type")
    public String type;

    public static ModifyLoginBaseConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoginBaseConfigRequest self = new ModifyLoginBaseConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLoginBaseConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyLoginBaseConfigRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public ModifyLoginBaseConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
