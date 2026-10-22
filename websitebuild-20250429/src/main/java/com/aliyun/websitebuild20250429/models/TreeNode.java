// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class TreeNode extends TeaModel {
    /**
     * <p>The list of child nodes.</p>
     */
    @NameInMap("Children")
    public java.util.List<TreeNode> children;

    /**
     * <p>The final step number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FinalStepNo")
    public Integer finalStepNo;

    /**
     * <p>The completion time.</p>
     */
    @NameInMap("FinishTime")
    public Long finishTime;

    /**
     * <p>Specifies whether the node is a container node.</p>
     */
    @NameInMap("IsContainerNode")
    public Boolean isContainerNode;

    /**
     * <p>The node ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2927b500-c4e2-4241-bacf-0a2991c4be12</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The node name.</p>
     * 
     * <strong>example:</strong>
     * <p>Single output</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The node status.</p>
     * 
     * <strong>example:</strong>
     * <p>UP</p>
     */
    @NameInMap("NodeStatus")
    public String nodeStatus;

    /**
     * <p>The operator role.</p>
     * 
     * <strong>example:</strong>
     * <p>System</p>
     */
    @NameInMap("OperatorRole")
    public String operatorRole;

    /**
     * <p>The parent node ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dpYLaezmVNRMGX56Cg4gLjrrVrMqPxX6</p>
     */
    @NameInMap("ParentNodeId")
    public String parentNodeId;

    /**
     * <p>The step number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StepNo")
    public Integer stepNo;

    public static TreeNode build(java.util.Map<String, ?> map) throws Exception {
        TreeNode self = new TreeNode();
        return TeaModel.build(map, self);
    }

    public TreeNode setChildren(java.util.List<TreeNode> children) {
        this.children = children;
        return this;
    }
    public java.util.List<TreeNode> getChildren() {
        return this.children;
    }

    public TreeNode setFinalStepNo(Integer finalStepNo) {
        this.finalStepNo = finalStepNo;
        return this;
    }
    public Integer getFinalStepNo() {
        return this.finalStepNo;
    }

    public TreeNode setFinishTime(Long finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public Long getFinishTime() {
        return this.finishTime;
    }

    public TreeNode setIsContainerNode(Boolean isContainerNode) {
        this.isContainerNode = isContainerNode;
        return this;
    }
    public Boolean getIsContainerNode() {
        return this.isContainerNode;
    }

    public TreeNode setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public TreeNode setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public TreeNode setNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus;
        return this;
    }
    public String getNodeStatus() {
        return this.nodeStatus;
    }

    public TreeNode setOperatorRole(String operatorRole) {
        this.operatorRole = operatorRole;
        return this;
    }
    public String getOperatorRole() {
        return this.operatorRole;
    }

    public TreeNode setParentNodeId(String parentNodeId) {
        this.parentNodeId = parentNodeId;
        return this;
    }
    public String getParentNodeId() {
        return this.parentNodeId;
    }

    public TreeNode setStepNo(Integer stepNo) {
        this.stepNo = stepNo;
        return this;
    }
    public Integer getStepNo() {
        return this.stepNo;
    }

}
