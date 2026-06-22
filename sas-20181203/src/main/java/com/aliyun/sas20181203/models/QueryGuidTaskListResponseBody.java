// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryGuidTaskListResponseBody extends TeaModel {
    /**
     * <p>The list of beginner task information.</p>
     */
    @NameInMap("GuideTaskConfigList")
    public java.util.List<QueryGuidTaskListResponseBodyGuideTaskConfigList> guideTaskConfigList;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique ID for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7532B7EE-7CE7-5F4D-BF04-B12447D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryGuidTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGuidTaskListResponseBody self = new QueryGuidTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGuidTaskListResponseBody setGuideTaskConfigList(java.util.List<QueryGuidTaskListResponseBodyGuideTaskConfigList> guideTaskConfigList) {
        this.guideTaskConfigList = guideTaskConfigList;
        return this;
    }
    public java.util.List<QueryGuidTaskListResponseBodyGuideTaskConfigList> getGuideTaskConfigList() {
        return this.guideTaskConfigList;
    }

    public QueryGuidTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryGuidTaskListResponseBodyGuideTaskConfigListRewardData extends TeaModel {
        /**
         * <p>The claim status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Not claimed.</li>
         * <li><strong>2</strong>: Claimed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsRewardTaked")
        public String isRewardTaked;

        /**
         * <p>The reward name. Valid values:</p>
         * <ul>
         * <li><strong>addTrialDay</strong>: trial days reward</li>
         * <li><strong>addAntiRansomwareCapacity</strong>: anti-ransomware capacity reward</li>
         * <li><strong>addImageScanAuthCount</strong>: image scan authorization quota reward</li>
         * <li><strong>addWebLockAuthCount</strong>: web tamper-proofing authorization quota reward</li>
         * <li><strong>addSlsCapacity</strong>: log analysis storage capacity reward.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>addAntiRansomwareCapacity</p>
         */
        @NameInMap("Reward")
        public String reward;

        /**
         * <p>The reward configuration information. This parameter is in JSON format.</p>
         * <blockquote>
         * <p>The key in the JSON object indicates the reward content, and the value indicates the reward amount. Valid values of the key:</p>
         * </blockquote>
         * <ul>
         * <li><strong>webLockAuthCount</strong>: the web tamper-proofing authorization quota</li>
         * <li><strong>ransomwareCapacity</strong>: the anti-ransomware capacity, in GB</li>
         * <li><strong>slsCapacity</strong>: the log analysis capacity, in GB</li>
         * <li><strong>days</strong>: the number of usage days</li>
         * <li><strong>imageScanAuthCount</strong>: the image scan authorization quota</li>
         * <li><strong>honeypotAuthCount</strong>: the cloud honeypot authorization quota.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;days&quot;:60,&quot;ransomwareCapacity&quot;:10}</p>
         */
        @NameInMap("RewardConfig")
        public String rewardConfig;

        public static QueryGuidTaskListResponseBodyGuideTaskConfigListRewardData build(java.util.Map<String, ?> map) throws Exception {
            QueryGuidTaskListResponseBodyGuideTaskConfigListRewardData self = new QueryGuidTaskListResponseBodyGuideTaskConfigListRewardData();
            return TeaModel.build(map, self);
        }

        public QueryGuidTaskListResponseBodyGuideTaskConfigListRewardData setIsRewardTaked(String isRewardTaked) {
            this.isRewardTaked = isRewardTaked;
            return this;
        }
        public String getIsRewardTaked() {
            return this.isRewardTaked;
        }

        public QueryGuidTaskListResponseBodyGuideTaskConfigListRewardData setReward(String reward) {
            this.reward = reward;
            return this;
        }
        public String getReward() {
            return this.reward;
        }

        public QueryGuidTaskListResponseBodyGuideTaskConfigListRewardData setRewardConfig(String rewardConfig) {
            this.rewardConfig = rewardConfig;
            return this;
        }
        public String getRewardConfig() {
            return this.rewardConfig;
        }

    }

    public static class QueryGuidTaskListResponseBodyGuideTaskConfigList extends TeaModel {
        /**
         * <p>The reward information for task completion.</p>
         */
        @NameInMap("RewardData")
        public QueryGuidTaskListResponseBodyGuideTaskConfigListRewardData rewardData;

        /**
         * <p>The security score increase that can be gained by completing this task.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SecurityScore")
        public Integer securityScore;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Closed.</li>
         * <li><strong>1</strong>: In progress.</li>
         * <li><strong>2</strong>: Completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-000d8slfgx4p40kb64ad</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        /**
         * <p>The node name. Valid values:</p>
         * <ul>
         * <li><strong>guid_task_security_score_promote_video</strong>: the node of watching the beginner quick start video</li>
         * <li><strong>guide_sub_task_config_defence_hbr</strong>: the anti-ransomware configuration node for servers</li>
         * <li><strong>guide_sub_task_config_uni_defence_hbr</strong>: the anti-ransomware configuration node for databases</li>
         * <li><strong>guid_task_log_analysis_config</strong>: the log analysis node</li>
         * <li><strong>guide_sub_task_web_lock_config</strong>: the web tamper-proofing node</li>
         * <li><strong>guide_sub_task_config_anti_crack</strong>: the anti-brute-force attacks node</li>
         * <li><strong>guid_task_container_security_video</strong>: the container security video node</li>
         * <li><strong>guid_task_container_image_scan_config</strong>: the container image scan node</li>
         * <li><strong>guid_task_k8s_log_analysis_config</strong>: the Kubernetes threat detection node</li>
         * <li><strong>guid_task_container_network</strong>: the container visualization node</li>
         * <li><strong>guide_sub_task_config_add_collection</strong>: the node of adding the console to favorites</li>
         * <li><strong>guide_sub_task_vul_scan</strong>: the vulnerability scanning node</li>
         * <li><strong>guide_sub_task_virusKill</strong>: the virus scan node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>guide_sub_task_config_add_collection</p>
         */
        @NameInMap("TaskTypeName")
        public String taskTypeName;

        public static QueryGuidTaskListResponseBodyGuideTaskConfigList build(java.util.Map<String, ?> map) throws Exception {
            QueryGuidTaskListResponseBodyGuideTaskConfigList self = new QueryGuidTaskListResponseBodyGuideTaskConfigList();
            return TeaModel.build(map, self);
        }

        public QueryGuidTaskListResponseBodyGuideTaskConfigList setRewardData(QueryGuidTaskListResponseBodyGuideTaskConfigListRewardData rewardData) {
            this.rewardData = rewardData;
            return this;
        }
        public QueryGuidTaskListResponseBodyGuideTaskConfigListRewardData getRewardData() {
            return this.rewardData;
        }

        public QueryGuidTaskListResponseBodyGuideTaskConfigList setSecurityScore(Integer securityScore) {
            this.securityScore = securityScore;
            return this;
        }
        public Integer getSecurityScore() {
            return this.securityScore;
        }

        public QueryGuidTaskListResponseBodyGuideTaskConfigList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryGuidTaskListResponseBodyGuideTaskConfigList setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

        public QueryGuidTaskListResponseBodyGuideTaskConfigList setTaskTypeName(String taskTypeName) {
            this.taskTypeName = taskTypeName;
            return this;
        }
        public String getTaskTypeName() {
            return this.taskTypeName;
        }

    }

}
