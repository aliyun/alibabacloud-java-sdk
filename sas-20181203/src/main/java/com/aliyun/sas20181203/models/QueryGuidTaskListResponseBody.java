// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryGuidTaskListResponseBody extends TeaModel {
    /**
     * <p>The list of beginner tasks.</p>
     */
    @NameInMap("GuideTaskConfigList")
    public java.util.List<QueryGuidTaskListResponseBodyGuideTaskConfigList> guideTaskConfigList;

    /**
     * <p>The request ID.</p>
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
         * <p>Indicates whether the reward is claimed. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: no.</li>
         * <li><strong>2</strong>: yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsRewardTaked")
        public String isRewardTaked;

        /**
         * <p>The name of the reward. Valid values:</p>
         * <ul>
         * <li><strong>addTrialDay</strong>: the days of trial use.</li>
         * <li><strong>addAntiRansomwareCapacity</strong>: the anti-ransomware capacity.</li>
         * <li><strong>addImageScanAuthCount</strong>: the quota for container image scan.</li>
         * <li><strong>addWebLockAuthCount</strong>: the quota for web tamper proofing.</li>
         * <li><strong>addSlsCapacity</strong>: the log storage capacity.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>addWebLockAuthCount</p>
         */
        @NameInMap("Reward")
        public String reward;

        /**
         * <p>The reward configuration. The value of this parameter is in the JSON format.</p>
         * <blockquote>
         * <p> The key indicates the reward type, and the value indicates the number of rewards. Valid values of key:</p>
         * </blockquote>
         * <ul>
         * <li><strong>webLockAuthCount</strong>: the quota for web tamper proofing.</li>
         * <li><strong>webLockAuthCount</strong>: the anti-ransomware capacity. Unit: GB.</li>
         * <li><strong>slsCapacity</strong>: the log storage capacity. Unit: GB.</li>
         * <li><strong>days</strong>: the days of trial use.</li>
         * <li><strong>imageScanAuthCount</strong>: the quota for container image scan.</li>
         * <li><strong>honeypotAuthCount</strong>: the quota for cloud honeypot.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;days&quot;:60,&quot;ransomwareCapacity&quot;:100}</p>
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
         * <p>The information about the reward for a complete task.</p>
         */
        @NameInMap("RewardData")
        public QueryGuidTaskListResponseBodyGuideTaskConfigListRewardData rewardData;

        /**
         * <p>The security score that is increased after you complete the task.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SecurityScore")
        public Integer securityScore;

        /**
         * <p>The status of the beginner task. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled.</li>
         * <li><strong>1</strong>: in progress.</li>
         * <li><strong>2</strong>: complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the beginner task.</p>
         * 
         * <strong>example:</strong>
         * <p>t-000d8slfgx4p40kb64ad</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        /**
         * <p>The name of the task type. Valid values:</p>
         * <ul>
         * <li><strong>guid_task_security_score_promote_video</strong>: the task of viewing a video tutorial for beginners.</li>
         * <li><strong>guide_sub_task_config_defence_hbr</strong>: the task of configuring anti-ransomware for servers.</li>
         * <li><strong>guide_sub_task_config_uni_defence_hbr</strong>: the task of configuring anti-ransomware for databases.</li>
         * <li><strong>guid_task_log_analysis_config</strong>: the task of configuring log analysis.</li>
         * <li><strong>guide_sub_task_web_lock_config</strong>: the task of configuring web tamper proofing.</li>
         * <li><strong>guide_sub_task_config_anti_crack</strong>: the task of configuring protection against brute-force attacks.</li>
         * <li><strong>guid_task_container_security_video</strong>: the task of viewing the video on how to protect containers.</li>
         * <li><strong>guid_task_container_image_scan_config</strong>: the task of configuring container image scan.</li>
         * <li><strong>guid_task_k8s_log_analysis_config</strong>: the task of configuring threat detection on Kubernetes containers.</li>
         * <li><strong>guid_task_container_network</strong>: the task of configuring container network visualization.</li>
         * <li><strong>guide_sub_task_config_add_collection</strong>: the task of saving a console URL.</li>
         * <li><strong>guide_sub_task_vul_scan</strong>: the task of scanning for vulnerabilities.</li>
         * <li><strong>guide_sub_task_virusKill</strong>: the task of configuring virus detection and removal.</li>
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
