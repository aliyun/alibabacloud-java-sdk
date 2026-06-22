// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyGroupPropertyRequest extends TeaModel {
    /**
     * <p>The new property information of the server group after modification. The following parameters are described:</p>
     * <ul>
     * <li><strong>groupFlag</strong>: The type of the server group. Valid values: <strong>0</strong> (default group) | <strong>1</strong> (other group).</li>
     * <li><strong>groupId</strong>: The ID of the server group.</li>
     * <li><strong>groupIndex</strong>: The sorting number of the server group. Sorted in ascending order.</li>
     * <li><strong>groupName</strong>: The name of the server group. Set this parameter to the new name of the server group. The new name must be different from the original name.</li>
     * </ul>
     * <blockquote>
     * <p>Call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to obtain the values of groupFlag and groupId. The values of groupFlag and groupId cannot be modified. Only the value of groupName can be modified.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;groupFlag&quot;:1,&quot;groupId&quot;:8436682,&quot;groupIndex&quot;:1,&quot;groupName&quot;:&quot;example&quot;}]</p>
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
