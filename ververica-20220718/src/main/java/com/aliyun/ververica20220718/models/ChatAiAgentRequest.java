// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ChatAiAgentRequest extends TeaModel {
    /**
     * <p>The list of Human-in-the-Loop (HITL) approval decisions, used to resume a session interrupted by a hitlPending event.</p>
     */
    @NameInMap("hitlDecisions")
    public java.util.List<ChatAiAgentRequestHitlDecisions> hitlDecisions;

    /**
     * <p>The resource references, including jobs and skill lists.</p>
     */
    @NameInMap("refs")
    public ChatAiAgentRequestRefs refs;

    /**
     * <p>The session ID. If not specified, the server generates one. For multi-turn conversations, pass the same value across requests.</p>
     * 
     * <strong>example:</strong>
     * <p>019F8CC7-EAD3-5E06-B0BF-3A2A0638B3DD-deliverData-20260723102220-VM8X0A5VZQ</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The user natural language input. The value must be 1 to 64,000 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("userMessage")
    public String userMessage;

    public static ChatAiAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatAiAgentRequest self = new ChatAiAgentRequest();
        return TeaModel.build(map, self);
    }

    public ChatAiAgentRequest setHitlDecisions(java.util.List<ChatAiAgentRequestHitlDecisions> hitlDecisions) {
        this.hitlDecisions = hitlDecisions;
        return this;
    }
    public java.util.List<ChatAiAgentRequestHitlDecisions> getHitlDecisions() {
        return this.hitlDecisions;
    }

    public ChatAiAgentRequest setRefs(ChatAiAgentRequestRefs refs) {
        this.refs = refs;
        return this;
    }
    public ChatAiAgentRequestRefs getRefs() {
        return this.refs;
    }

    public ChatAiAgentRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ChatAiAgentRequest setUserMessage(String userMessage) {
        this.userMessage = userMessage;
        return this;
    }
    public String getUserMessage() {
        return this.userMessage;
    }

    public static class ChatAiAgentRequestHitlDecisions extends TeaModel {
        /**
         * <p>The approval decision. Valid values: approve and deny.</p>
         * 
         * <strong>example:</strong>
         * <p>approve</p>
         */
        @NameInMap("decision")
        public String decision;

        /**
         * <p>The approval item ID corresponding to the hitlPending event.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("hitlId")
        public String hitlId;

        public static ChatAiAgentRequestHitlDecisions build(java.util.Map<String, ?> map) throws Exception {
            ChatAiAgentRequestHitlDecisions self = new ChatAiAgentRequestHitlDecisions();
            return TeaModel.build(map, self);
        }

        public ChatAiAgentRequestHitlDecisions setDecision(String decision) {
            this.decision = decision;
            return this;
        }
        public String getDecision() {
            return this.decision;
        }

        public ChatAiAgentRequestHitlDecisions setHitlId(String hitlId) {
            this.hitlId = hitlId;
            return this;
        }
        public String getHitlId() {
            return this.hitlId;
        }

    }

    public static class ChatAiAgentRequestRefsJobs extends TeaModel {
        /**
         * <p>Deployment ID</p>
         * 
         * <strong>example:</strong>
         * <p>2a63abb7-7ae7-4902-9970-fe5cff4bd7c1</p>
         */
        @NameInMap("deploymentId")
        public String deploymentId;

        /**
         * <p>Job ID</p>
         * 
         * <strong>example:</strong>
         * <p>ccb853c3-1d5a-438d-bf98-346815ad875a</p>
         */
        @NameInMap("jobId")
        public String jobId;

        public static ChatAiAgentRequestRefsJobs build(java.util.Map<String, ?> map) throws Exception {
            ChatAiAgentRequestRefsJobs self = new ChatAiAgentRequestRefsJobs();
            return TeaModel.build(map, self);
        }

        public ChatAiAgentRequestRefsJobs setDeploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }
        public String getDeploymentId() {
            return this.deploymentId;
        }

        public ChatAiAgentRequestRefsJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class ChatAiAgentRequestRefs extends TeaModel {
        /**
         * <p>The list of job references.</p>
         */
        @NameInMap("jobs")
        public java.util.List<ChatAiAgentRequestRefsJobs> jobs;

        /**
         * <p>The list of skills to inject.</p>
         */
        @NameInMap("skills")
        public java.util.List<String> skills;

        public static ChatAiAgentRequestRefs build(java.util.Map<String, ?> map) throws Exception {
            ChatAiAgentRequestRefs self = new ChatAiAgentRequestRefs();
            return TeaModel.build(map, self);
        }

        public ChatAiAgentRequestRefs setJobs(java.util.List<ChatAiAgentRequestRefsJobs> jobs) {
            this.jobs = jobs;
            return this;
        }
        public java.util.List<ChatAiAgentRequestRefsJobs> getJobs() {
            return this.jobs;
        }

        public ChatAiAgentRequestRefs setSkills(java.util.List<String> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<String> getSkills() {
            return this.skills;
        }

    }

}
