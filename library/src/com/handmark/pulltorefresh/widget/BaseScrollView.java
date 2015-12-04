package com.handmark.pulltorefresh.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class BaseScrollView extends ScrollView
{
	public static interface OnScrollChangedListener
	{
		public void onScrollChanged(int l, int t, int oldl, int oldt);
	}

	private OnScrollChangedListener	listener;

	public void setOnScrollChangedListener(OnScrollChangedListener listener)
	{
		this.listener = listener;
	}

	public BaseScrollView(Context context, AttributeSet attrs)
	{
		super(context, attrs);
	}

	@Override
	protected void onScrollChanged(int l, int t, int oldl, int oldt)
	{
		super.onScrollChanged(l, t, oldl, oldt);
		if (this.listener != null)
		{
			this.listener.onScrollChanged(l, t, oldl, oldt);
		}
	}
}
