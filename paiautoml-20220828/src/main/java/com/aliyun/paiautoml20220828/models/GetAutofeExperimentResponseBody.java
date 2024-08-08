// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class GetAutofeExperimentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>INVALID_USER_OR_EXP</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>266977839132045194</p>
     */
    @NameInMap("Creator")
    public String creator;

    @NameInMap("Detail")
    public java.util.Map<String, ?> detail;

    /**
     * <strong>example:</strong>
     * <p>tfKs0Ds</p>
     */
    @NameInMap("ExperimentId")
    public String experimentId;

    /**
     * <strong>example:</strong>
     * <p>2023-08-18T09:41:01Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2023-11-30T02:05:34.000Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <strong>example:</strong>
     * <p>{&quot;action&quot;: &quot;fs_train&quot;, &quot;request_id&quot;: &quot;6B6D4FB6-87AA-5C0E-94AB-E0F830955D1E&quot;, &quot;job_num&quot;: 7, &quot;job_runs&quot;: [{&quot;job_url&quot;: &quot;<a href="https://pai.console.aliyun.com/?projectId=&regionId=cn-beijing#/studio/task/detail/flow-fqlk86bvk68">https://pai.console.aliyun.com/?projectId=&amp;regionId=cn-beijing#/studio/task/detail/flow-fqlk86bvk68</a>&quot;, &quot;duration&quot;: 181, &quot;finish_at&quot;: 1719158854000, &quot;create_time&quot;: &quot;2024-06-23T16:04:31.000Z&quot;, &quot;status&quot;: &quot;Succeeded&quot;}, {&quot;job_url&quot;: &quot;<a href="https://pai.console.aliyun.com/?projectId=&regionId=cn-beijing#/studio/task/detail/flow-q18k5jo66h3k">https://pai.console.aliyun.com/?projectId=&amp;regionId=cn-beijing#/studio/task/detail/flow-q18k5jo66h3k</a>&quot;, &quot;duration&quot;: 233, &quot;finish_at&quot;: 1719159106000, &quot;create_time&quot;: &quot;2024-06-23T16:07:51.000Z&quot;, &quot;status&quot;: &quot;Succeeded&quot;}, {&quot;job_url&quot;: &quot;<a href="https://pai.console.aliyun.com/?projectId=&regionId=cn-beijing#/studio/task/detail/flow-g7b38dmqes0nm4le">https://pai.console.aliyun.com/?projectId=&amp;regionId=cn-beijing#/studio/task/detail/flow-g7b38dmqes0nm4le</a>&quot;, &quot;duration&quot;: 173, &quot;finish_at&quot;: 1719159306000, &quot;create_time&quot;: &quot;2024-06-23T16:12:12.000Z&quot;, &quot;status&quot;: &quot;Succeeded&quot;}, {&quot;job_url&quot;: &quot;<a href="https://pai.console.aliyun.com/?projectId=&regionId=cn-beijing#/studio/task/detail/flow-524dab97aazs3jmc">https://pai.console.aliyun.com/?projectId=&amp;regionId=cn-beijing#/studio/task/detail/flow-524dab97aazs3jmc</a>&quot;, &quot;duration&quot;: 199, &quot;finish_at&quot;: 1719159527000, &quot;create_time&quot;: &quot;2024-06-23T16:15:28.000Z&quot;, &quot;status&quot;: &quot;Succeeded&quot;}, {&quot;job_url&quot;: &quot;<a href="https://pai.console.aliyun.com/?projectId=&regionId=cn-beijing#/studio/task/detail/flow-a8z56wy2ppwmxx04">https://pai.console.aliyun.com/?projectId=&amp;regionId=cn-beijing#/studio/task/detail/flow-a8z56wy2ppwmxx04</a>&quot;, &quot;duration&quot;: 197, &quot;finish_at&quot;: 1719159747000, &quot;create_time&quot;: &quot;2024-06-23T16:19:08.000Z&quot;, &quot;status&quot;: &quot;Succeeded&quot;}, {&quot;job_url&quot;: &quot;<a href="https://pai.console.aliyun.com/?projectId=&regionId=cn-beijing#/studio/task/detail/flow-2cgsbxzzzma1j">https://pai.console.aliyun.com/?projectId=&amp;regionId=cn-beijing#/studio/task/detail/flow-2cgsbxzzzma1j</a>&quot;, &quot;duration&quot;: 210, &quot;finish_at&quot;: 1719159982000, &quot;create_time&quot;: &quot;2024-06-23T16:22:51.000Z&quot;, &quot;status&quot;: &quot;Succeeded&quot;}, {&quot;job_url&quot;: &quot;<a href="https://pai.console.aliyun.com/?projectId=&regionId=cn-beijing#/studio/task/detail/flow-3cgsvf3ien1cw7">https://pai.console.aliyun.com/?projectId=&amp;regionId=cn-beijing#/studio/task/detail/flow-3cgsvf3ien1cw7</a>&quot;, &quot;duration&quot;: 184, &quot;finish_at&quot;: 1719160188000, &quot;create_time&quot;: &quot;2024-06-23T16:26:43.000Z&quot;, &quot;status&quot;: &quot;Succeeded&quot;}], &quot;workspace_id&quot;: &quot;86006&quot;}{&quot;action&quot;: &quot;fs_train&quot;, &quot;request_id&quot;: &quot;6B6D4FB6-87AA-5C0E-94AB-E0F830955D1E&quot;, &quot;job_num&quot;: 7, &quot;job_runs&quot;: [{&quot;job_url&quot;: &quot;<a href="https://pai.console.aliyun.com/?projectId=&regionId=cn-beijing#/studio/task/detail/flow-fqlk86betchc69vk68">https://pai.console.aliyun.com/?projectId=&amp;regionId=cn-beijing#/studio/task/detail/flow-fqlk86betchc69vk68</a>&quot;, &quot;duration&quot;: 181, &quot;finish_at&quot;: 1719158854000, &quot;create_time&quot;: &quot;2024-06-23T16:04:31.000Z&quot;, &quot;status&quot;: &quot;Succeeded&quot;}, {&quot;job_url&quot;: &quot;<a href="https://pai.console.aliyun.com/?projectId=&regionId=cn-beijing#/studio/task/detail/flow-q18ijqak558jo66h3k">https://pai.console.aliyun.com/?projectId=&amp;regionId=cn-beijing#/studio/task/detail/flow-q18ijqak558jo66h3k</a>&quot;, &quot;duration&quot;: 233, &quot;finish_at&quot;: 1719159106000, &quot;create_time&quot;: &quot;2024-06-23T16:07:51.000Z&quot;, &quot;status&quot;: &quot;Succeeded&quot;}, {&quot;job_url&quot;: &quot;<a href="https://pai.console.aliyun.com/?projectId=&regionId=cn-beijing#/studio/task/detail/flow-g7b38df7mqes0nm4le">https://pai.console.aliyun.com/?projectId=&amp;regionId=cn-beijing#/studio/task/detail/flow-g7b38df7mqes0nm4le</a>&quot;, &quot;duration&quot;: 173, &quot;finish_at&quot;: 1719159306000, &quot;create_time&quot;: &quot;2024-06-23T16:12:12.000Z&quot;, &quot;status&quot;: &quot;Succeeded&quot;}, {&quot;job_url&quot;: &quot;<a href="https://pai.console.aliyun.com/?projectId=&regionId=cn-beijing#/studio/task/detail/flow-524zedab97aazs3jmc">https://pai.console.aliyun.com/?projectId=&amp;regionId=cn-beijing#/studio/task/detail/flow-524zedab97aazs3jmc</a>&quot;, &quot;duration&quot;: 199, &quot;finish_at&quot;: 1719159527000, &quot;create_time&quot;: &quot;2024-06-23T16:15:28.000Z&quot;, &quot;status&quot;: &quot;Succeeded&quot;}, {&quot;job_url&quot;: &quot;<a href="https://pai.console.aliyun.com/?projectId=&regionId=cn-beijing#/studio/task/detail/flow-a8z56wy2ppm6wmxx04">https://pai.console.aliyun.com/?projectId=&amp;regionId=cn-beijing#/studio/task/detail/flow-a8z56wy2ppm6wmxx04</a>&quot;, &quot;duration&quot;: 197, &quot;finish_at&quot;: 1719159747000, &quot;create_time&quot;: &quot;2024-06-23T16:19:08.000Z&quot;, &quot;status&quot;: &quot;Succeeded&quot;}, {&quot;job_url&quot;: &quot;<a href="https://pai.console.aliyun.com/?projectId=&regionId=cn-beijing#/studio/task/detail/flow-2cgsbxzx9i35zzma1j">https://pai.console.aliyun.com/?projectId=&amp;regionId=cn-beijing#/studio/task/detail/flow-2cgsbxzx9i35zzma1j</a>&quot;, &quot;duration&quot;: 210, &quot;finish_at&quot;: 1719159982000, &quot;create_time&quot;: &quot;2024-06-23T16:22:51.000Z&quot;, &quot;status&quot;: &quot;Succeeded&quot;}, {&quot;job_url&quot;: &quot;<a href="https://pai.console.aliyun.com/?projectId=&regionId=cn-beijing#/studio/task/detail/flow-3cgsvf3bprlien1cw7">https://pai.console.aliyun.com/?projectId=&amp;regionId=cn-beijing#/studio/task/detail/flow-3cgsvf3bprlien1cw7</a>&quot;, &quot;duration&quot;: 184, &quot;finish_at&quot;: 1719160188000, &quot;create_time&quot;: &quot;2024-06-23T16:26:43.000Z&quot;, &quot;status&quot;: &quot;Succeeded&quot;}], &quot;workspace_id&quot;: &quot;86006&quot;}</p>
     */
    @NameInMap("JobMeta")
    public String jobMeta;

    /**
     * <strong>example:</strong>
     * <p>Missing \&quot;user_id\&quot; in request.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>071A904D-5A49-597F-9F69-81C7701D04AC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>age,sex,education</p>
     */
    @NameInMap("SelectedFeatures")
    public String selectedFeatures;

    /**
     * <strong>example:</strong>
     * <p>FINISHED, FAILED, USER_CANCELED</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetAutofeExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutofeExperimentResponseBody self = new GetAutofeExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutofeExperimentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAutofeExperimentResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetAutofeExperimentResponseBody setDetail(java.util.Map<String, ?> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.Map<String, ?> getDetail() {
        return this.detail;
    }

    public GetAutofeExperimentResponseBody setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public GetAutofeExperimentResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetAutofeExperimentResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetAutofeExperimentResponseBody setJobMeta(String jobMeta) {
        this.jobMeta = jobMeta;
        return this;
    }
    public String getJobMeta() {
        return this.jobMeta;
    }

    public GetAutofeExperimentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAutofeExperimentResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetAutofeExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutofeExperimentResponseBody setSelectedFeatures(String selectedFeatures) {
        this.selectedFeatures = selectedFeatures;
        return this;
    }
    public String getSelectedFeatures() {
        return this.selectedFeatures;
    }

    public GetAutofeExperimentResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
