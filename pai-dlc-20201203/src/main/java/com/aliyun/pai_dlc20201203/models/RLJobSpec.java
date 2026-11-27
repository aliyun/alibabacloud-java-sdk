// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLJobSpec extends TeaModel {
    /**
     * <p>接受 tag 或 sha256 摘要。未指定配方且已提供所需资源池时，可省略镜像并使用平台为该资源池配置的默认镜像；无唯一默认镜像时须显式指定。</p>
     * 
     * <strong>example:</strong>
     * <p>registry.example.com/rls/verl@sha256:0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>该资源条目的工作节点数量，默认 1，必须为正整数；不包括平台管理的辅助节点。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PodCount")
    public Integer podCount;

    /**
     * <p>资源池配额 ID；省略时使用作业级 ResourceId。不同资源池可指定不同配额；使用多个配额时每个池必须显式指定，train 池的配额为作业主配额。各配额均须已在作业工作空间授权且属于同一 VPC</p>
     * 
     * <strong>example:</strong>
     * <p>quotag2uo09dyp40</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>每个 Pod 的资源规格，所有值均为字符串。CPU、Memory 必须为正值；GPU 省略时为 CPU 资源池，提供时必须为正整数。GPUType 可省略，并可从已解析的作业或配额信息中确定；若配额存在多种 GPU 类型且尚未确定目标类型，必须显式指定。SharedMemory 可选。最终资源组合还须满足所选框架、入口与 TrainerMode 的拓扑约束。</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceConfig")
    public ResourceConfig resourceConfig;

    /**
     * <p>资源角色，必填，使用小写 train 或 rollout，在 JobSpecs 内唯一。文档中的 rollout/train 表示二选一，不是可直接提交的字面值</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>train</p>
     */
    @NameInMap("Type")
    public String type;

    public static RLJobSpec build(java.util.Map<String, ?> map) throws Exception {
        RLJobSpec self = new RLJobSpec();
        return TeaModel.build(map, self);
    }

    public RLJobSpec setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public RLJobSpec setPodCount(Integer podCount) {
        this.podCount = podCount;
        return this;
    }
    public Integer getPodCount() {
        return this.podCount;
    }

    public RLJobSpec setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public RLJobSpec setResourceConfig(ResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
        return this;
    }
    public ResourceConfig getResourceConfig() {
        return this.resourceConfig;
    }

    public RLJobSpec setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
