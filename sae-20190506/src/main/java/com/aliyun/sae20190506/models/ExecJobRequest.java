// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ExecJobRequest extends TeaModel {
    /**
     * <p>The job template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ee1a7a07-abcb-4652-a1d3-2d57f415****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The startup command, which must be an executable that exists in the container. Example:</p>
     * <pre><code>command:
     *       - echo
     *       - abc
     *       - &gt;
     *       - file0
     * </code></pre>
     * <p>Based on this example, <code>Command</code> is <code>echo</code> and <code>CommandArgs</code> is <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>echo</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>The arguments for the <strong>Command</strong> parameter. The value must be a string that represents a JSON array. Format:</p>
     * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
     * <p>In the preceding example for the <code>Command</code> parameter, <code>CommandArgs</code> is <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>. The JSON array <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> must be converted to a string. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;a&quot;,&quot;b&quot;]</p>
     */
    @NameInMap("CommandArgs")
    public String commandArgs;

    /**
     * <p>The container environment variables. You can specify custom environment variables or reference an existing ConfigMap. For more information about creating a ConfigMap, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>.</p>
     * <ul>
     * <li><p>Custom configuration</p>
     * <ul>
     * <li><p><strong>name</strong>: The name of the environment variable.</p>
     * </li>
     * <li><p><strong>value</strong>: The value of the environment variable.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Reference a ConfigMap</p>
     * <ul>
     * <li><p><strong>name</strong>: The name of the environment variable. You can reference a single key or all keys. To reference all keys, use the <code>sae-sys-configmap-all-&lt;ConfigMap name&gt;</code> format. Example: <code>sae-sys-configmap-all-test1</code>.</p>
     * </li>
     * <li><p><strong>valueFrom</strong>: The source of the environment variable. Set the value to <code>configMapRef</code>.</p>
     * </li>
     * <li><p><strong>configMapId</strong>: The ID of the ConfigMap.</p>
     * </li>
     * <li><p><strong>key</strong>: The key that you want to reference. If you want to reference all key-value pairs, do not specify this parameter.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;envtmp&quot;,&quot;value&quot;:&quot;0&quot;}]</p>
     */
    @NameInMap("Envs")
    public String envs;

    /**
     * <p>A customizable event ID that ensures idempotency. The system creates only one job for requests that have the same event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>Arguments for starting a job deployed from a JAR package. The default startup command is:
     * <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
     * 
     * <strong>example:</strong>
     * <p>custom-args</p>
     */
    @NameInMap("JarStartArgs")
    public String jarStartArgs;

    /**
     * <p>Options for starting a job deployed from a JAR package. The default startup command is:
     * <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArg</code></p>
     * 
     * <strong>example:</strong>
     * <p>-Xms4G -Xmx4G</p>
     */
    @NameInMap("JarStartOptions")
    public String jarStartOptions;

    /**
     * <p>The number of concurrent instances.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Replicas")
    public String replicas;

    /**
     * <p>The time to trigger the job, specified in the <code>yyyy-MM-dd\\&quot;T\\&quot;HH:mm:ss\\&quot;Z\\&quot;</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-09-14T14:25:02Z</p>
     */
    @NameInMap("Time")
    public String time;

    /**
     * <p>The startup command for a job deployed from a WAR package. Configuration is the same as for an image-based deployment. For more information, see <a href="https://help.aliyun.com/document_detail/96677.html">Configure a startup command</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>CATALINA_OPTS=\&quot;$CATALINA_OPTS $Options\&quot; catalina.sh run</p>
     */
    @NameInMap("WarStartOptions")
    public String warStartOptions;

    public static ExecJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecJobRequest self = new ExecJobRequest();
        return TeaModel.build(map, self);
    }

    public ExecJobRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ExecJobRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public ExecJobRequest setCommandArgs(String commandArgs) {
        this.commandArgs = commandArgs;
        return this;
    }
    public String getCommandArgs() {
        return this.commandArgs;
    }

    public ExecJobRequest setEnvs(String envs) {
        this.envs = envs;
        return this;
    }
    public String getEnvs() {
        return this.envs;
    }

    public ExecJobRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public ExecJobRequest setJarStartArgs(String jarStartArgs) {
        this.jarStartArgs = jarStartArgs;
        return this;
    }
    public String getJarStartArgs() {
        return this.jarStartArgs;
    }

    public ExecJobRequest setJarStartOptions(String jarStartOptions) {
        this.jarStartOptions = jarStartOptions;
        return this;
    }
    public String getJarStartOptions() {
        return this.jarStartOptions;
    }

    public ExecJobRequest setReplicas(String replicas) {
        this.replicas = replicas;
        return this;
    }
    public String getReplicas() {
        return this.replicas;
    }

    public ExecJobRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public ExecJobRequest setWarStartOptions(String warStartOptions) {
        this.warStartOptions = warStartOptions;
        return this;
    }
    public String getWarStartOptions() {
        return this.warStartOptions;
    }

}
