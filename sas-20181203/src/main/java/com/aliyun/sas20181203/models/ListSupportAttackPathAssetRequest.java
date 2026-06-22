// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListSupportAttackPathAssetRequest extends TeaModel {
    /**
     * <p>The node type. Valid values:</p>
     * <ul>
     * <li><strong>start</strong>: start node.</li>
     * <li><strong>end</strong>: end node.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>end</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>The path name.</p>
     * <blockquote>
     * <p>Call <a href="~~ListAvailableAttackPath~~">ListAvailableAttackPath</a> to query path names.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecs_get_credential_by_create_login_profile</p>
     */
    @NameInMap("PathName")
    public String pathName;

    /**
     * <p>The path type.</p>
     * <blockquote>
     * <p>Call <a href="~~ListAvailableAttackPath~~">ListAvailableAttackPath</a> to query path types.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>role_escalation</p>
     */
    @NameInMap("PathType")
    public String pathType;

    /**
     * <p>The support type. Valid values:</p>
     * <ul>
     * <li><strong>event</strong>: attack path alert event.</li>
     * <li><strong>whitelist</strong>: attack path whitelist.</li>
     * <li><strong>sensitive</strong>: attack path sensitive asset.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>event</p>
     */
    @NameInMap("SupportType")
    public String supportType;

    public static ListSupportAttackPathAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSupportAttackPathAssetRequest self = new ListSupportAttackPathAssetRequest();
        return TeaModel.build(map, self);
    }

    public ListSupportAttackPathAssetRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public ListSupportAttackPathAssetRequest setPathName(String pathName) {
        this.pathName = pathName;
        return this;
    }
    public String getPathName() {
        return this.pathName;
    }

    public ListSupportAttackPathAssetRequest setPathType(String pathType) {
        this.pathType = pathType;
        return this;
    }
    public String getPathType() {
        return this.pathType;
    }

    public ListSupportAttackPathAssetRequest setSupportType(String supportType) {
        this.supportType = supportType;
        return this;
    }
    public String getSupportType() {
        return this.supportType;
    }

}
