// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SetDataLevelPermissionWhiteListRequest extends TeaModel {
    /**
     * <p>{ &quot;ruleType&quot;: &quot;ROW_LEVEL&quot;, // The row-level permission type. &quot;usersModel&quot;: { &quot;userGroups&quot;: [ &quot;0d5fb19b- <em><strong>-1248 fc27ca51&quot;, // The ID of the user group. &quot;3d2c23d4-</strong></em>-f6390f325c2d&quot; ], &quot;users&quot;: [ &quot;4334 <em><strong>358&quot;, // Quick BI the UserID of the user. &quot;Huang</strong></em>3fa822&quot; ] }, &quot;cubeId&quot;: &quot;7c7223ae-31d1-4d2f-b11f-3c744528014b&quot; }</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ruleType&quot;:&quot;ROW_LEVEL&quot;,&quot;usersModel&quot;:{&quot;userGroups&quot;:[&quot;26edcb76-<em><em><strong>-bdbab78267cb&quot;,&quot;187e6dd5-1611-4cf7-a034-1a93bd5fecf9&quot;],&quot;users&quot;:[&quot;4334</strong></em>358&quot;,&quot;Huang</em>**3fa822&quot;]},&quot;cubeId&quot;:&quot;7c7223ae-****44528014b&quot;}</p>
     */
    @NameInMap("WhiteListModel")
    public String whiteListModel;

    public static SetDataLevelPermissionWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDataLevelPermissionWhiteListRequest self = new SetDataLevelPermissionWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public SetDataLevelPermissionWhiteListRequest setWhiteListModel(String whiteListModel) {
        this.whiteListModel = whiteListModel;
        return this;
    }
    public String getWhiteListModel() {
        return this.whiteListModel;
    }

}
