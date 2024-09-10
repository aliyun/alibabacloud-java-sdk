// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyGroupPropertyRequest extends TeaModel {
    /**
     * <p>The new attributes of the server group. You can specify the following parameters to configure the attributes:</p>
     * <ul>
     * <li><strong>groupFlag</strong>: the type of the server group. Valid values: 0 and 1. The value <strong>0</strong> specifies the Default server group. The value <strong>1</strong> specifies other server groups.</li>
     * <li><strong>groupId</strong>: the ID of the server group.</li>
     * <li><strong>groupIndex</strong>: no meaning. You can leave this parameter empty.</li>
     * <li><strong>groupName</strong>: the name of the server group. The value is the new name of the server group. The new name cannot be the same as the original name of the server group.</li>
     * </ul>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to obtain the values of the groupFlag and groupId parameters. You cannot change the value of the groupFlag or groupId parameter. You can change only the value of the groupName parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;groupFlag&quot;:1,&quot;groupId&quot;:8436682,&quot;groupIndex&quot;:,&quot;groupName&quot;:&quot;example&quot;}]</p>
     */
    @NameInMap("Data")
    public String data;

    public static ModifyGroupPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGroupPropertyRequest self = new ModifyGroupPropertyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGroupPropertyRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
