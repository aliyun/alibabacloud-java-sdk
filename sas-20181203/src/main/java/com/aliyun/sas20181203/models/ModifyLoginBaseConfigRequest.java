// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyLoginBaseConfigRequest extends TeaModel {
    /**
     * <p>The details of the configuration that is used to detect unusual logons to your servers. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><strong>totalCount</strong>: the total number of servers.</li>
     * <li><strong>uuidCount</strong>: the number of servers to which the configuration is applied.</li>
     * <li><strong>id</strong>: the ID of the configuration.</li>
     * <li><strong>location</strong>: the common logon location.</li>
     * </ul>
     * <blockquote>
     * <p>You must specify this field if the Type parameter is set to login_common_location.</p>
     * </blockquote>
     * <ul>
     * <li><strong>ip</strong>: the common logon IP address.</li>
     * </ul>
     * <blockquote>
     * <p>You must specify this field if the Type parameter is set to login_common_ip.</p>
     * </blockquote>
     * <ul>
     * <li><strong>endTime</strong>: the end time of the common logon time range.</li>
     * </ul>
     * <blockquote>
     * <p>You must specify this field if the Type parameter is set to login_common_time.</p>
     * </blockquote>
     * <ul>
     * <li><strong>startTime</strong>: the start time of the common logon time range.</li>
     * </ul>
     * <blockquote>
     * <p>You must specify this field if the Type parameter is set to login_common_time.</p>
     * </blockquote>
     * <ul>
     * <li><strong>account</strong>: the common logon account.</li>
     * </ul>
     * <blockquote>
     * <p>You must specify this field if the Type parameter is set to login_common_account.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;totalCount&quot;:174,&quot;uuidCount&quot;:4,&quot;location&quot;:&quot;Montenegro&quot;,&quot;id&quot;:0}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The details of the server to which the configuration is applied. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><p><strong>Target</strong>: the UUID of the server.</p>
     * </li>
     * <li><p><strong>targetType</strong>: the type of the server to which the configuration is applied. Valid values:</p>
     * <ul>
     * <li><strong>uuid</strong>: a server</li>
     * <li><strong>groupId</strong>: a server group</li>
     * </ul>
     * </li>
     * <li><p><strong>flag</strong>: the operation that you want to perform on the server. Valid values:</p>
     * <ul>
     * <li><strong>del</strong>: removes the server from the configuration.</li>
     * <li><strong>add</strong>: adds the server to the configuration.</li>
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
     * <p>The logon type of the configuration to modify. Valid values:</p>
     * <ul>
     * <li><strong>login_common_location</strong>: common logon location</li>
     * <li><strong>login_common_ip</strong>: common logon IP address</li>
     * <li><strong>login_common_time</strong>: common logon time range</li>
     * <li><strong>login_common_account</strong>: common logon account</li>
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
